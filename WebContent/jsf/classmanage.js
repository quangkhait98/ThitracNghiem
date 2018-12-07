$(document).ready(function(){
$('#addclass').click(function() {
	$.ajax({
		url:"addclass", 
		type:"POST",
		async: false,
		data: {
			malop:$('#malop').val(),
			tenlop:$('#tenlop').val(),
			
		},
		success: function(content, status) {
			$("#report_result").html(content);
			$('#class_table > tbody').empty();
			$.ajax({
				url:"classmanage",
				data:{
				},
				async:false,
				type:"POST",
				success: function(content, status) {
					$('#class_table > tbody').html(content);
				}
			});
		}
	}); 
	/*$(this).next().click(); */
	});
});
$(document).on('click', '.table-remove', function() {
	var classID = $(this).closest('tr').children('td:nth-child(2)').text();
	var isDelete = window.confirm("Bạn thực sự muốn xóa lớp ?");
	if(isDelete) {
		$('#class_table > tbody').empty();
		$.ajax({
			url:"deleteclass", 
			type:"POST",
			async: false,
			data: {
				ID: classID
			},
			success: function(content, status) {
				$("#report_result").html(content);
				$.ajax({
					url:"classmanage",
					data:{
					},
					async:false,
					type:"POST",
					success: function(content, status) {
						$('#class_table > tbody').html(content);
					}
				});
			}
		});
	}
});