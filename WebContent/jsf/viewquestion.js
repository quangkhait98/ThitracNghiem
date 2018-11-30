$(document).ready(function(){      
$('#searchBut').click(function() {
		pageOffset = 0;
		pageLength=4;
		isLimit=false;
		$('#question_table > tbody').empty();
		$.ajax({
			url:"questionmanage",
			data:{
				chonmon:$('#chonmon').val(),
				search:$('#search').val(),
				chonloai:$('#chonloai').val(),
				offset:0,
				length:pageLength
			},
			async:false,
			type:"POST",
			success: function(content, status) {	
				var pageIndex = pageOffset / pageLength + 1;
				$('#question_table_cap').text("Trang "+pageIndex);
				$('#question_table > tbody').html(content);	
			}
		});
	});
 });
$(document).ready(function(){  
	$('#backBut').click(function() {
		$('#question_table > tbody').empty();
		if(pageOffset >= pageLength) {
			pageOffset -= pageLength;
		}
		$.ajax({
			url:"questionmanage",
			data:{
				chonmon:$('#chonmon').val(),
				search:$('#search').val(),
				chonloai:$('#chonloai').val(),
				offset:pageOffset,
				length:pageLength
			},
			async:false,
			type:"POST",
			success: function(content, status) {
				var pageIndex = pageOffset / pageLength + 1;
				$('#question_table_cap').text("Trang "+pageIndex);
				$('#question_table > tbody').html(content);		
				if(content.trim() == '') {
					pageOffset = 0;
				} else {
					isLimit = false;
				}
			}
		});
	});
});	

$(document).ready(function(){  
	$('#forwardBut').click(function() {
		$('#question_table > tbody').empty();
		if(!isLimit) {
			pageOffset += pageLength;
		}
		$.ajax({
			url:"questionmanage",
			data:{
				chonmon:$('#chonmon').val(),
				search:$('#search').val(),
				chonloai:$('#chonloai').val(),
				offset:pageOffset,
				length:pageLength
			},
			async:false,
			type:"POST",
			success: function(content, status) {
				var pageIndex = pageOffset / pageLength + 1;
				$('#question_table_cap').text("Trang "+ pageIndex);
				$('#question_table > tbody').html(content);
				if(content.trim() == '') {
					isLimit = true;
				} else {
					isLimit = false;
				}
			}
		});
	});
<<<<<<< HEAD
<<<<<<< HEAD
});
=======
});	
>>>>>>> parent of c216beb... phan lop
=======
});	
>>>>>>> parent of c216beb... phan lop
