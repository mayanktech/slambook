<%-- 
    Document   : LoadMoreFriendsVideo
    Created on : Nov 21, 2014, 1:13:15 AM
    Author     : mayank
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<c:forEach var="i" begin="1" end="8"> 
    <div class="col-xs-4">


        <div class="thumbnail">
            <div class="albumImagesNumberCaption">Video Caption</div>
            <img style="width:100%;" src="resources/images/14.jpg" alt="...">
            <div class="caption">

                <small>Video label</small>

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
