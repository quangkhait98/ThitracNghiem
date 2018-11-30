<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
$(document).on("click", function() {
	$(".info").hide();
});

$(document).ready(function() {
	$('.sidebar-feature').click(function() {
		$('.sidebar-feature').removeClass("sidebar-selected");
		$(this).addClass("sidebar-selected");
	});

	$('#toggle-img').click(function(event) {
		event.stopPropagation();
		$(".info").slideToggle("fast");
	});
	$(".user-name").click(function(event) {
		event.stopPropagation();
		$(".info").slideToggle("fast");
	});
	$(".info").on("click", function(event) {
		event.hide();
	});
});

$(document).ready(function myFunction() {
	var x = document.getElementById("mySidebar");
	if (x.className === "sidebar") {
		x.className += " responsive";
	} else {
		x.className = "sidebar";
	}
	var y = document.getElementById("myContainer");
	if (y.className === "container-main") {
		y.className += " responsive";
	} else {
		y.className = "container-main";
	}
})
=======
=======
>>>>>>> parent of c216beb... phan lop
=======
>>>>>>> parent of c216beb... phan lop
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
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> parent of c216beb... phan lop
=======
>>>>>>> parent of c216beb... phan lop
=======
>>>>>>> parent of c216beb... phan lop
