$(document).ready(function(){
    var height = $(window).height();
    var width = $(window).width();
    $('body').css('width', width);
    var cssmenuWidth = $("#sidebar1").width();
    $('#cssmenu>ul').css('width', cssmenuWidth);
    myLoadFunction();

});

function myLoadFunction()
{
    $.ajax({url: BASE_URL+"news/recieve",success:function(result){  
    $("#mainbody").html(result);
  }});
    setTimeout("myLoadFunction()", 2000);
}

function savecomment()
{
   var com = $("#newComment").val();
   var comment = com.replace(/\n/g, "<br>");  
   var newsId = $("#newsId").val();
   var val = {
       comment: comment,
       newsId: newsId
   };
  
   $.ajax({
            url: BASE_URL+"comment/savecomment",
            type: 'POST',
            data: val
       });
   $("#newComment").val('');  
   location.reload();
}
