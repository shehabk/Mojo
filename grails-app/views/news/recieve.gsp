<!--
  To change this template, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Sample title</title>
  </head>
  <body>
    <div id="page1">
    
        <g:each var="news" in="${newsIntance}">
          <div id="subdiv">
            <div id ="leftcolumn">
              <img width="100%" height="100%" src="${resource(dir: imageDir, file: news.image_name)}">
              <g:link controller="news" action="details" params='[newsid: "${news.id}" ]'> </g:link>
            </div>
            <div id="rightcolumn">
              <g:link controller="news" action="details" params='[newsid: "${news.id}" ]'> ${news.annotation} </g:link>
            </div>
          </div>
        </g:each>
   
 </div>
  </body>
</html>
