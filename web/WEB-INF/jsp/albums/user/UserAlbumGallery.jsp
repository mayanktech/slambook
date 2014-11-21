<%-- 
    Document   : UserAlbums
    Created on : 4 Jan, 2014, 1:09:13 PM
    Author     : Mayank
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<div class="row slideXL slidingDivInner userAlbumGallery">


    <div class="col-xs-12">


        <div class="panel panel-primary">
            <div class="panel-heading">
                <h4 class="panel-title text-center"><span class="glyphicon glyphicon-paperclip pull-left"></span> Your Albums <span class="glyphicon glyphicon-paperclip pull-right"></span></h4>
            </div>

            <div class="panel-body">

                <div class="row">
                    <c:forEach var="i" begin="1" end="3">
                        <div class="col-xs-4">

                            <div class="thumbnail">
                                <div>
                                    <img style="width:100%;" src="resources/images/14.jpg" alt="...">
                                    <div class="albumImageCountDiv">10 photos</div>
                                </div>
                                <div class="caption">
                                    <small>Album Name</small>

                                    <div class="row">

                                        <div class="col-xs-6 center"> 
                                            <button type="button" class="btn btn-info btn-sm">
                                                <span class="glyphicon glyphicon-comment"></span> 100
                                            </button>
                                        </div>
                                        <div class="col-xs-6 center"> 
                                            <button type="button" class="btn btn-info btn-sm">
                                                <span class="glyphicon glyphicon-heart-empty"></span> 100
                                            </button>
                                        </div>

                                    </div>

                                </div>

                            </div>
                        </div>
                    </c:forEach>


                </div>



                <div class="row">
                    <c:forEach var="i" begin="1" end="3">
                        <div class="col-xs-4">

                            <div class="thumbnail">
                                <div>
                                    <img style="width:100%;" src="resources/images/14.jpg" alt="...">
                                    <div class="albumImageCountDiv">10 photos</div>
                                </div>
                                <div class="caption">
                                    <small>Album Name</small>

                                    <div class="row">

                                        <div class="col-xs-6 center"> 
                                            <button type="button" class="btn btn-info btn-sm">
                                                <span class="glyphicon glyphicon-comment"></span> 100
                                            </button>
                                        </div>
                                        <div class="col-xs-6 center"> 
                                            <button type="button" class="btn btn-info btn-sm">
                                                <span class="glyphicon glyphicon-heart-empty"></span> 100
                                            </button>
                                        </div>

                                    </div>

                                </div>

                            </div>
                        </div>
                    </c:forEach>


                </div>

            </div>

            <div class="panel-footer">


                <p class="panel-title text-center"> <button class="btn btn-info btn-sm"><span class="glyphicon glyphicon-plus-sign"></span> Add New Album </button>&nbsp;&nbsp;<button class="btn btn-sm btn-info"> <span class="glyphicon glyphicon-upload"></span> Add Image To An Album</button>&nbsp;&nbsp;<button class="btn btn-sm btn-danger closeSlidingDiv"> <span class="glyphicon glyphicon-remove"></span> Close</button> </p>


            </div>
        </div>



    </div>

</div>
</div>
