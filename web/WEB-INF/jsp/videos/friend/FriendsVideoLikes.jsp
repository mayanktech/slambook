<%-- 
    Document   : FriendsAlbumLikes
    Created on : 4 Jan, 2014, 1:08:53 PM
    Author     : Mayank
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="row slideXL slidingDivInner friendVideoLikes">
    
     <div class="col-xs-12">
        
        
         <div class="panel panel-primary">
                        <div class="panel-heading">
                            <h4 class="panel-title text-center"><span class="glyphicon glyphicon-paperclip pull-left"></span> Friends Who Like This Album <span class="glyphicon glyphicon-remove-sign closeSlidingDiv pull-right"></span></h4>
                        </div>
                   
                        <div class="panel-body">
                            <div class="row" >
                                
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
                                
                                
                            </div>
                                <div class="row">
                            
                            <div class="col-xs-12">
                                
                                <button class="btn btn-info center-block">
                                    
                                    Load More
                                    
                                </button>
                                
                            </div>
                            
                            
                        </div> 
                        </div>
         </div>
    
</div>