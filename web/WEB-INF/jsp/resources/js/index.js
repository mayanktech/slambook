/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var signup;

var signUpForm = function (firstName, lastName, email, password, conpassword, sex, dob) {

    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.password = password;
    this.conpassword = conpassword;
    this.sex = sex;
    this.dob = dob;
    this.fieldStatus = true;
    this.passwordStatus = true;
    this.validEmailStatus = true;
    this.emailRegisteredStatus = true;

    this.formRef = $(".formTable");
    this.firstNameRef = $("#firstName");
    this.sexRef = $("#gender");
    this.dobRef = $("#birthday");
    this.lastNameRef = $("#larstName");
    this.emailRef = $("#email");
    this.passwordRef = $("#password");
    this.conPasswordRef = $("#repeatPassword");
    this.submitBtnRef = $("#signUpBtn");


    this.validatePassword = function () {

        if (this.conpassword.length !== 0) {

            if (this.password == this.conpassword) {

                $('#checkPassword').attr("src", "resources/images/correct.gif");
                this.passwordStatus = true;


            }
            else {

                $('#checkPassword').attr("src", "resources/images/wrong.png");
                $('#checkPassword').css("display", "inline");
                this.passwordStatus = false;


            }

        }

    };

    this.validateEmptyFields = function () {


        $(".formTable").find('input[type="text"],input[type="password"]').each(function () {


            if ($(this).val().trim() == "") {

                signup.fieldStatus = false;



            }
            else {

                signup.fieldStatus = true;

            }


        });
    };

    this.validateEmail = function () {


        var filter = /^([\w-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([\w-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$/;

        if (filter.test(this.email)) {


            this.validEmailStatus = true;



        }

        else {

            this.validEmailStatus = false;


        }


    };
    this.emailRegisteredStatusCheck = function () {

        $.ajax({
            url: 'UserInfo/checkEmail',
            type: 'post',
            data: {
                email: this.email
            }

        }).success(function (msg) {


            if (msg == false) {

                $('#checkEmail').attr("src", "resources/images/correct.gif");
                checkemailajax = "true";
                this.emailRegisteredStatus = true;


            }
            else {

                $('#checkEmail').attr("src", "resources/images/wrong.png");
                status = "falseemail";
                checkemailajax = "true";
                this.emailRegisteredStatus = true;


            }


        });

    };

    this.displayError = function () {



        if (!this.fieldStatus) {

            var d = new simpleDialog("Some Fields Are Empty", "danger");
            d.show();

        }

        else if (!this.validEmailStatus) {

            var d = new simpleDialog("Email Is Not Valid", "danger");
            d.show();


        }

        else if (!this.passwordStatus) {

            var d = new simpleDialog("Passwords did not Match", "danger");
            d.show();


        }

        else if (!this.emailRegisteredStatus) {

            var d = new simpleDialog("Email Is Already Regitered", "danger");
            d.show();


        }

    };

    this.submitForm = function () {

        var loadingDialog = new bodyOnlyDialog("Loading Please Wait");
        loadingDialog.show();

        $.ajax({
            url: "userInfo/addUser",
            type: 'post',
            data: $('#signUp').serialize()
        }).success(function () {

            loadingDialog.hide();
            $('#signUp').get(0).reset();
        });

    };

};


var dialog = function (message, title) {

    this.message = message;
    this.title = title;
    this.dialogRef = $("#fullModal");
    this.dialogBodyRef = $("#fullModal .modal-body");
    this.dialogTitleRef = $("#fullModal .modal-title");
    this.dialogSecondaryBtnRef = $("#fullModal #dialogSecondaryBtn");
    this.show = function () {

        this.dialogBodyRef.html(this.message);
        this.dialogTitleRef.html(this.title);
        this.dialogRef.modal('show');
    };

    this.hide = function () {

        this.dialogRef.modal('hide');

    };

};

var bodyOnlyDialog = function (message) {
    this.message = message;

    this.dialogRef = $("#bodyOnlyModal");
    this.dialogBodyRef = $("#bodyOnlyModal .modal-body");
    this.show = function () {

        this.dialogBodyRef.html(this.message);

        this.dialogRef.modal('show');
    };

    this.hide = function () {

        this.dialogRef.modal('hide');

    };
};


var simpleDialog = function (message, type) {

    this.alertclass;
    this.message = message;
    this.dialogText;
    this.typeOfDialogText;
    this.type = type;
    this.alertRef = $(".alert");
    this.alertTypeRef = $(".alert strong");
    this.alertTextRef = $(".alert span");
    this.closeBtnRef = $(".alert .close");
    if (this.type == "danger") {

        this.alertclass = "alert-danger";
        this.typeOfDialogText = "Error ! ";
    }
    else if (this.type == "success") {

        this.alertclass = "alert-success";
        this.typeOfDialogText = "Success ! ";
    }
    else if (this.type == "warning") {

        this.alertclass = "alert-warning";
        this.typeOfDialogText = "Warning ! ";
    }
    else if (this.type == "info") {

        this.alertclass = "alert-info";
        this.typeOfDialogText = "Information ! ";
    }

    this.alertRef.addClass(this.alertclass);
    this.alertTypeRef.html(this.typeOfDialogText);
    this.alertTextRef.html(this.message);
    this.show = function () {

        $(".simpleDialog").fadeIn(1000);



    };
    this.hide = function () {

        $(".simpleDialog").fadeOut(1000);
    };

    this.closeBtnRef.on("click", function () {

        $(".simpleDialog").fadeOut(1000);
    });


};



$(document).ready(function () {


    signup = new signUpForm("", "", "", "", "", "", "");

    signup.emailRef.on("blur", function () {

        signup.email = signup.emailRef.val();
        signup.validateEmail();
        signup.emailRegisteredStatusCheck();
        console.log("Hii");
    });

    signup.conPasswordRef.on("blur", function () {

        signup.password = signup.passwordRef.val();
        signup.conpassword = signup.conPasswordRef.val();

        signup.validatePassword();


    });

    signup.submitBtnRef.on("click", function (e) {

        e.preventDefault();


        signup.validateEmptyFields();
        signup.validatePassword();
        signup.validateEmail();

        if (signup.fieldStatus && signup.passwordStatus && signup.validEmailStatus && signup.emailRegisteredStatus) {


            signup.firstName = signup.firstNameRef.val();
            signup.lastName = signup.lastNameRef.val();
            signup.sex = signup.sexRef.val();
            signup.dob = signup.dobRef.val();

            signup.submitForm();
        }
        else {

            signup.displayError();
        }

    });


    $('.input-group.date').datepicker({
        keyboardNavigation: false
    });


});



