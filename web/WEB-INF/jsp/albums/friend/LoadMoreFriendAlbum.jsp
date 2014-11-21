<%-- 
    Document   : LoadMoreFriendAlbum
    Created on : Nov 20, 2014, 8:31:57 PM
    Author     : mayank
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

