<%-- 
    Document   : index1
    Created on : 17 Dec, 2013, 1:27:26 PM
    Author     : Mayank
--%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- <c:set var="url">${pageContext.request.requestURL}</c:set> -->
        <base href="${fn:substring(url, 0, fn:length(url) - fn:length(pageContext.request.requestURI))}${pageContext.request.contextPath}/" />

        <link href="resources/css/bootstrap.min.css"  rel="stylesheet" type="text/css"/>
        <link href="resources/css/zocial.css"  rel="stylesheet" type="text/css"/>
        <script type="text/javascript" src="resources/js/jquery-1.8.0.min.js"></script>
        <script type="text/javascript" src="resources/js/bootstrap.js"></script>
        <script src="resources/js/index.js" type="text/javascript"></script>
        <link href="resources/css/datepicker3.css" rel="stylesheet">
        <script src="resources/js/bootstrap-datepicker.js"></script>
        <title>Slambook Bootstrap</title>

        <script>

            $(document).ready(function(){
                
                $('.introcarouselbtn').click(function (e) {

                e.preventDefault();
                
                $('html, body').animate({
                    scrollTop:0
                }, 1500, function () {

                

                });
                
                
             });
             
             
             
             
             
             
             
               $('.signupdivbtn').click(function (e) {

                e.preventDefault();
                
               // document.title = 'Events - Melange 2013';
                $('html, body').animate({
                    scrollTop: $('.signupdiv').offset().top
                }, 1500, function () {

                    //window.location.hash = "event";

                });
                
                
             });
             
             
             
             
             
              $('.signindivbtn').click(function (e) {

                e.preventDefault();
                //document.title = 'Events - Melange 2013';
                $('html, body').animate({
                    scrollTop: $('.signindiv').offset().top
                }, 1500, function () {

                  //  window.location.hash = "event";

                });
                
                
             });
             
             
             

                
            });
    

        </script>

        <style>

            .table td{

                border: none;

            }
            .modal{

                overflow-y:auto;
            }


            .navbar-brand{

                //color:white !important;
            }

            .navbar-brand:hover{

                //color:whitesmoke !important;
            }
            .navbar-text{

                color:white !important;
            }
            .navbar-link{
                color:white !important;
            }

            .errorDialogHeader{
                color: #a94442;
                background-color: #f2dede;
                border-color: #ebccd1;
            }
            .simpleDialog{

                position:fixed;
                top:0%;
                width:100%;

                height:100%;
                background:rgba(0,0,0,0.6);
                z-index:10000;
                display:none;
            }

            body{


                min-width:1024px !important;
                width:100% !important;
                overflow-y: hidden;
            }

            .container-fluid{


                min-width: 1024px !important;
                width:100% !important;
            }

            .item img{

                // height:80% !important;
                width:84%;
                margin-left: 8%;
                margin-right:8%;
            }

            .item{

                text-align: center;
            }


        </style>




    </head>
    <body style="height:100% !important">
        <!-- Menubar -->
        <div class="navbar-fixed-top navbar-inverse navbar" role="navigation">

            <div class="container-fluid" >
                <div class="row-fluid">
                    <div class="navbar-header">
                        <a class="navbar-brand introcarouselbtn" href="#" style="">&nbsp;&nbsp;<span class="glyphicon glyphicon-book"></span> &nbsp;Slambook</a>
                    </div>

                    <div class="navbar-right">
                        <ul class="nav navbar-nav">

                            <li role="presentation"><a href="#" class="signupdivbtn">SignUp</a></li>
                            <li role="presentation"><a href="#" class="signindivbtn">Login</a></li>

                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <!-- Menubar -->
        <!-- Main Container Wrapper -->
        <div class="container-fluid" style="">


            <!-- Sub Container Division Wrapper -->
            <div class="row-fluid" >

                <!-- Introduction -->
                <div class="col-xs-12">
                    <!-- <iframe style="width:100%; height:428px" src="http://www.youtube.com/embed/4XjRE_R9UDY" frameborder="0" allowfullscreen></iframe> -->
                    <div id="carousel-example-generic" class="carousel slide introcarousel" data-ride="carousel" style="height:auto;min-height:600px;margin-top: 3%">
                        <!-- Indicators -->
                        <ol class="carousel-indicators">
                            <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                            <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                            <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                        </ol>

                        <!-- Wrapper for slides -->
                        <div class="carousel-inner">
                            <div class="item active">
                                <img src="resources/images/carousel/1.png" alt="..." >
                                <div class="carousel-caption">
                                    ...
                                </div>
                            </div>
                            <div class="item">
                                <img src="resources/images/carousel/2.png" alt="..." >
                                <div class="carousel-caption">
                                    ...
                                </div>
                            </div>
                            <div class="item">
                                <img src="resources/images/carousel/3.png" alt="..." >
                                <div class="carousel-caption">
                                    ...
                                </div>
                            </div>
                        </div>

                        <!-- Controls -->
                        <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
                            <span class="glyphicon glyphicon-chevron-left"></span>
                        </a>
                        <a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
                            <span class="glyphicon glyphicon-chevron-right"></span>
                        </a>
                    </div>                      

                    <!-- Introduction -->

                </div>
                <!-- Sub Container Division Wrapper -->

            </div>

            <!-- Signup Division Wrapper -->
            <div class="row-fluid signupdiv" style="min-height:600px;">

                <div class="col-xs-6">

                    <div class="panel panel-info">
                        <div class="panel-heading">
                            <h3 class="panel-title text-center">Sign Up With Your Favourite Social Network</h3>
                        </div>
                        <div class="panel-body text-center">

                            <p style="margin-top:10%;">
                                <button class="zocial facebook">Sign Up with Facebook</button>
                            </p>
                            <p style="margin-top:10%;">
                                <button class="zocial twitter">Sign Up with Twitter</button>
                            </p>
                            <p style="margin-top:10%;margin-bottom: 10%">
                                <button class="zocial googleplus">Sign Up with Google+</button>
                            </p>


                        </div>
                    </div>

                </div>

                <div class="col-xs-6">

                    <div class="panel panel-info">
                        <div class="panel-heading">
                            <h3 class="panel-title text-center">Sign Up</h3>
                        </div>
                        <div class="panel-body">
                            <form role="form">
                                <div class="form-group">
                                    <label for="">First Name</label>
                                    <input type="name" class="form-control" path="firstName" id="firstName" placeholder="Enter First Name">
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Last Name</label>
                                    <input type="name" class="form-control" path="lastName" id="lastName" placeholder="Enter Last Name">
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Email address</label>
                                    <input type="email" class="form-control" path="email" id="email" placeholder="Enter email">
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword1">Password</label>
                                    <input type="password" class="form-control" path="firstName" id="password" placeholder="Password">
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword2">Confirm Password</label>
                                    <input type="password" class="form-control" path="password" id="repeatPassword" placeholder="Password">
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword1">I Am</label>
                                    <select class="form-control" path="gender" id="gender">

                                        <option>Male</option>
                                        <option>Female</option>

                                    </select>
                                </div>

                                <div class="form-group">
                                    <label for="exampleInputEmail1">Date Of Birth</label>
                                    <div class="input-group date">
                                        <input type="text" path="birthday" class="form-control"/><span class="input-group-addon"><i class="glyphicon glyphicon-th"></i></span>
                                    </div>
                                </div>


                                <button type="submit" id="signUpBtn" class="btn btn-default">Submit</button>
                            </form>
                        </div>
                    </div>

                </div>

            </div>
            <!-- Signup Division Wrapper -->

            <!-- SignIn Division Wrapper -->
            <div class="row-fluid signindiv" style="min-height:600px;" >

                <div class="col-xs-6">
                    <div class="panel panel-info">
                        <div class="panel-heading">
                            <h3 class="panel-title text-center">Sign Up</h3>
                        </div>
                        <div class="panel-body">
                        </div>
                    </div>
                </div>

                <div class="col-xs-6">
                    <div class="panel panel-info">
                        <div class="panel-heading">
                            <h3 class="panel-title text-center">Sign Up</h3>
                        </div>
                        <div class="panel-body" >
                        </div>
                    </div>
                </div>

            </div>

            <!-- SignIn Division Wrapper -->
        </div>

        <!-- Full Modal -->
        <div class="modal fade" id="fullModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header errorDialogHeader">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title" id="myModalLabel">Modal title</h4>
                    </div>
                    <div class="modal-body">

                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-primary" data-dismiss="modal">Close</button>
                        <button type="button" class="btn btn-primary" id="dialogSecondaryBtn" style="display:none">Save changes</button>
                    </div>
                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->               



        <!-- Body Only Modal -->
        <div class="modal fade" id="bodyOnlyModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">

                    <div class="modal-body">
                        <div class="progress">
                            <div class="progress-bar progress-bar-striped active" role="progressbar" aria-valuenow="100" aria-valuemin="100" aria-valuemax="100" style="width: 100%">

                            </div>
                        </div>
                    </div>

                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div><!-- /.modal --> 


        <div class="simpleDialog" style="">

            <div class="alert  alert-dismissable fade in" style="width:40%;margin-left:30%;margin-right:30%;position:absolute;top:10%;">
                <button type="button" class="close" aria-hidden="true">&times;</button>
                <strong></strong> <span>Best check yo self, you're not looking too good.</span>
            </div>

        </div>


        <!-- Sliding-XL Container Wrapper -->



        <div class="slidingDiv">



        </div>

        <!-- Sliding-XL Container Wrapper -->

    </body>
</html>
