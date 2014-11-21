<%-- 
    Document   : LoadMoreFriendAlbumLikes
    Created on : Nov 20, 2014, 11:15:22 PM
    Author     : mayank
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:forEach var="i" begin="1" end="8">
    <div class="col-xs-3" style="margin-bottom: 3%;">
        <div class="media">
            <a class="pull-left" href="#">
                <img class="media-object" src="resources/images/14.jpg" width="64" height="64" alt="..."/>
            </a>
            <div class="media-body">
                <h5 class="media-heading">Selena Gomez</h5>

            </div>
        </div>
    </div>
</c:forEach>
