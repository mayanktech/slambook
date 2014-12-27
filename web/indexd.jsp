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

        <style>

            .table td{

                border: none;

            }
            .modal{

                overflow-y:auto;
            }


            .navbar-brand{

                color:white !important;
            }

            .navbar-brand:hover{

                color:whitesmoke !important;
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
            }

            .container-fluid{


                min-width: 1024px !important;
                width:100% !important;
            }

            .item img{

                height:100% !important;
            }


        </style>




    </head>
    <body>
        <!-- Menubar -->
        <div class="navbar-fixed-top navbar-inverse navbar" role="navigation">

            <div class="container-fluid" >
                <div class="row-fluid">
                    <div class="navbar-header">
                        <a class="navbar-brand" href="#" style="">&nbsp;&nbsp;<span class="glyphicon glyphicon-book"></span> &nbsp;Slambook</a>
                    </div>
                    <form class="navbar-form navbar-right" role="search">
                        <div class="form-group">

                            <input type="text" class="form-control input-sm" placeholder="Username">

                        </div>
                        <div class="form-group">

                            <input type="password" class="form-control input-sm" placeholder="Password">

                        </div>

                        <button type="button" class="btn btn-info btn-sm"> Login <span class="glyphicon glyphicon-log-in"></span></button>&nbsp;&nbsp;

                    </form>
                </div>
            </div>
        </div>
        <!-- Menubar -->
        <!-- Main Container Wrapper -->
        <div class="container-fluid" style="margin-top:5%;">


            <!-- Sub Container Division Wrapper -->
            <div class="row-fluid" style="height:auto">

                <!-- Introduction -->
                <div class="col-xs-6" style="height: auto;">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <h3 class="panel-title text-center"><span class="glyphicon glyphicon-paperclip pull-left"></span> Get More Information <span class="glyphicon glyphicon-paperclip pull-right"></span></h3>
                        </div>
                        <div class="panel-body" style="padding:0px;height:auto">
                            <!-- <iframe style="width:100%; height:428px" src="http://www.youtube.com/embed/4XjRE_R9UDY" frameborder="0" allowfullscreen></iframe> -->
                            <div id="carousel-example-generic" class="carousel slide" data-ride="carousel" style="height:auto">
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
                        </div>
                    </div>
                </div>
                <!-- Introduction -->
                <!-- SignUp -->
                <div class="col-xs-6" style="height: auto;">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <h3 class="panel-title text-center"><span class="glyphicon glyphicon-paperclip pull-left"></span> Sign Up <span class="glyphicon glyphicon-paperclip pull-right"></span></h3>
                        </div>
                        <div class="panel-body" style="padding:0px;">

                            <table class="table formTable" style="margin-top: 5px">

                                <sf:form id="signUp" method="POST" modelAttribute="user" action="userInfo/addUser">
                                    <tr><td style="text-align: right;font-size: 1.3em;">First Name</td><td><sf:input type="text" path="firstName" id="firstName" class="form-control input-md" /></td><td></td></tr>
                                    <tr><td style="text-align: right;font-size: 1.3em;">Last Name</td><td><sf:input type="text" path="lastName" id="lastName" class="form-control" /></td><td></td></tr>
                                    <tr><td style="text-align: right;font-size: 1.3em;">Your Email</td><td><sf:input type="text" path="email" id="email" class="form-control" /></td><td><img id="checkEmail" src="resources/images/282.gif" style="display:inline;visibility:hidden"/></td></tr>
                                    <tr><td style="text-align: right;font-size: 1.3em;">Password</td><td><sf:input type="password" path="firstName" id="password" class="form-control" /></td><td></td></tr>
                                    <tr><td style="text-align: right;font-size: 1.3em;">Confirm Password</td><td><sf:input type="password" path="password" id="repeatPassword" class="form-control" /></td><td><img id="checkPassword" src=""/></td></tr>
                                    <tr><td style="text-align: right;font-size: 1.3em;">I am</td><td><sf:select path="gender" id="gender" class="form-control"><sf:option value="Male">Male</sf:option><sf:option value="Female">Female</sf:option></sf:select></td><td></td></tr>
                                            <tr><td style="text-align: right;font-size: 1.3em;">Birthday</td><td><div class="input-group date">
                                                <sf:input type="text" path="birthday" class="form-control"/><span class="input-group-addon"><i class="glyphicon glyphicon-th"></i></span>
                                            </div></td><td></td></tr>
                                    <tr><td colspan="2" style="text-align: center"><button class="btn btn-info" id="signUpBtn">Sign Up <span class="glyphicon glyphicon-plus-sign"></span></button></td><td></td></tr>
                                            </sf:form>
                                <tr>

                                    <td style="text-align:center"  >

                                        <button class="zocial facebook">Sign in with Facebook</button>

                                    </td>
                                    <td style="text-align:center">

                                        <button class="zocial twitter">Sign in with Twitter</button>

                                    </td>


                                </tr>  

                            </table>



                        </div>

                    </div>

                </div>
                <!-- SignUp --> 
            </div>
            <!-- Sub Container Division Wrapper -->

        </div>  

        <!-- Footer -->
        <div class="navbar navbar-inverse navbar-fixed-bottom">

            <span class="navbar-text navbar-right">Developed By <a href="#" class="navbar-link">Mayank Sharma &nbsp;&nbsp;</a></span>
            <span class="navbar-text navbar-left"><span class="glyphicon glyphicon-copyright-mark"></span>&nbsp;2013 Mayank Sharma</span>

        </div>    
        <!-- Footer -->

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
