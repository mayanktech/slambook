<%-- 
    Document   : AddAnswers
    Created on : Nov 21, 2014, 1:41:54 AM
    Author     : mayank
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="row slideL slidingDivInner">
    
    
    <div class="col-xs-12">
        
        
         <div class="panel panel-primary">
                        <div class="panel-heading">
                            <h4 class="panel-title text-center"><span class="glyphicon glyphicon-paperclip pull-left"></span> Edit Slambook Questions <span class="glyphicon glyphicon-remove-sign closeSlidingDiv pull-right"></span></h4>
                        </div>
                   
                        <div class="panel-body">
                             
                            <c:forEach var="i" begin="1" end="16">
                            <div class="row inputgrp">
                                
                                
                                
                                <div class="col-xs-12">
                                    
                                    <h5>Question #<c:out value="${i}"/></h5>
                                    <textarea rows="2" class="input-md form-control"></textarea>
                                    
                                </div>
                                
                            </div>
                            </c:forEach>
                        </div>
             
             
             
                         <div class="panel-footer">
                            
                             <div class="row">
                                 
                                 <div class="col-xs-8">
                                     
                                 </div>
                                 
                                 <div class="col-xs-3">
                                     <button  class="btn btn-sm btn-info pull-left"> <span class="glyphicon glyphicon-refresh"></span> Reset All Answers </button>
                                 </div>
                                 
                                 <div class="col-xs-1">
                                     
                                     <button  class="btn btn-sm btn-info pull-right"> <span class="glyphicon glyphicon-save"></span> Save Answers </button>
                                     
                                 </div>
                                 
                             </div>
                            
                            
                            
                        </div>
             
         </div>
        
    </div>
    
</div>