$(document).ready(function() {
	$('#def').click(function() {
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
				dapAn : dapAn
			},
			success : function(data) {
				$('#myContainer').html(data);
			}
		})
	})
})