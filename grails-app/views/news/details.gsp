<!--
  To change this template, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
  <head>
    <meta name="layout" content="main"> 
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  </head>
<body>
<div id="detailnewspage">

	<div id="topsection">

		<div id="picture">
                     <img width="100%" height="100%" src="${resource(dir: imageDir, file: newsdetails.image_name)}">
                </div>
		<div id="right">
			<div id="annotation" class ="annotationclass">
                            ${newsdetails.annotation}
                        </div>
			<div id="userinfo"></div>
		</div>
	</div>
  
    <div class="commentlikha">
     <p> Details </p>
    </div>
 
  <div id="middlesection">
     ${newsdetails.details}
  </div>
  
   <div class="commentlikha">
     <p> Comments </p>
   </div>	
	
	<div id="bottomsection">
           <g:each var="comment" in="${commentIntance}">
                <div id="comment" >
                   ${comment.comment_details}  
                </div>
             </g:each>
	<!--	<div id="timedate"></div>
		<div id="commentinguserinfo"></div> -->
  
  <div id="giveComment" width="100%">
      <input type="hidden" id="newsId" value="${newsdetails.id}"></input>
      <textarea id="newComment" style="width: 100%;" ></textarea>
   </div>
   <div id ="buttondiv">
      <button id ="commentbutton" name="commentButton" type="button" onclick="savecomment();"> 
        Comment </button>
   </div>
	</div>

</div>
</body>

</html> 
