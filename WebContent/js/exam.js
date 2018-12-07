$(document).ready(function() {
	$('#nopbaibtn').click(function() {
		var dapAn = [], i = 0;
		$('label.questionLabel').each(function() {
			var name = $(this).attr('for');
			dapAn[i] = $('input[name=' + name + ']:checked').val();
			if (typeof dapAn[i] === "undefined") {
				dapAn[i] = 0;
			}
			i++;
		})
		$.ajax({
			url : "SubmitBaiThi",
			type : "POST",
			async : false,
			data : {
				dapAn : dapAn,
				soluong : i
			},
			success : function(data) {
				$('#myContainer').html(data);
			}
		})
	})
})
$(document).ready(function() {
	$('label.questionLabel').each(function() {
		var name = $(this).attr('for');
		$('input[name=' + name + ']').change(function() {
			if (this.checked) {
				$('#index-' + name).children().css("color", "red");
			}
		});
	});

	var currentTab = 0;
	showTab(currentTab);

	function showTab(n) {
		var x = document.getElementsByClassName("hidden");
		for (var i = 0; i < 10; i++)
			x[n + i].style.display = "block";
	}
	function nextPrev(n) {
		var x = document.getElementsByClassName("hidden");
		for (var i = 0; i < 10; i++)
			x[currentTab + i].style.display = "none";
		currentTab = currentTab + n;
		if (currentTab >= x.length) {
			currentTab -= 10;
		}
		if (currentTab < 0) {
			currentTab += 10;
		}

		showTab(currentTab);
	}
	$('#prev').click(function() {
		nextPrev(-10);
	})
	$('#next').click(function() {
		nextPrev(10);
	})
});
