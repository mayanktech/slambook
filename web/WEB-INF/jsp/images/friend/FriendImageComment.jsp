<%-- 
    Document   : FriendImageComment
    Created on : Nov 20, 2014, 6:47:50 PM
    Author     : mayank
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="row slideXXL slidingDivInner friendImageCommentsDiv" style="" >

    <div class="col-xs-12">

        <div class="panel panel-primary">
            <div class="panel-heading">
                <h4 class="panel-title text-center"><span class="glyphicon glyphicon-comment "></span>&nbsp;&nbsp;Image Comments<span class="glyphicon glyphicon-remove-sign pull-right closeSlidingDiv"></span></h4>
            </div>

            <div class="panel-body">

                <div class="row">

                    <div class="col-xs-8" style="position:relative">
                        <div class="ImagesNameCaption">
                            Image Caption
                            <div class="row">

                                <div class="col-xs-6 center"> 
                                    <p><span class="glyphicon glyphicon-comment"></span>&nbsp;<span class="badge">100K</span></p>
                                </div>
                                <div class="col-xs-6 center"> 
                                    <p> <span class="glyphicon glyphicon-heart"></span>&nbsp;<span class="badge">100K</span></p>
                                </div>

                            </div>

                        </div>
                        <img style="width:100%;height:100%;" src="resources/images/14.jpg" alt="...">

                    </div>

                    <div class="col-xs-4" style="">
                        <div class="commentsInnerDiv" style="">

                            <c:forEach var="i" begin="1" end="8">
                                <div class="media">
                                    <a class="pull-left" href="#">
                                        <img class="media-object" src="resources/images/14.jpg" width="64" height="64" alt="..."/>
                                    </a>
                                    <div class="media-body">
                                        <h5 class="media-heading">Selena Gomez</h5>
                                        <small>sdsahdvsa dasdasdsa asdasd ad a adsadsd asdsdsads wdsdsadsad asdasd dadas asd</small>
                                    </div>
                                </div>      
                            </c:forEach>


                        </div>

                        <div style="width:100%;height:80px;margin-top:5px;">

                            <textarea placeholder="Enter Your Comment" class="form-control input-sm" style="width:100%;height:100%;" ></textarea> 

                        </div>

                    </div>



                </div>


            </div>



        </div>

    </div>

</div>