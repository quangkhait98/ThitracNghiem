$(document).on("click", function () {
	$(".info").hide();
});

$(document).ready(function(){
    $('.sidebar-feature').click(function(){
	 	$('.sidebar-feature').removeClass("sidebar-selected");
	 	$(this).addClass("sidebar-selected");
	});

 	$('#toggle-img').click(function(event){
        event.stopPropagation();
         $(".info").slideToggle("fast");
    });
    $(".user-name").click(function(event){
        event.stopPropagation();
         $(".info").slideToggle("fast");
    });
    $(".info").on("click", function (event) {
        event.hide();
    }); 
});
