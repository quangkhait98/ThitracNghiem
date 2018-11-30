<%@tag description="Header Page template" pageEncoding="UTF-8"%>
<%@attribute name="header" fragment="true"%>
<div class="header">
	<div class="cover-header">
		<div class="software-name">
			<h3>LUYỆN THI TRẮC NGHIỆM</h3>
		</div>
		<div class="logo-inline"></div>

		<div class="toggle-info">
			<img id="toggle-img" src="images/user-icon-logout.png" alt="">
			<span class="user-name">${user.tenNguoiDung}</span>
			<div class="info">
				<div class="myinfo item-info">
					<a href="profile.jsp">
					<span>Thông tin cá nhân</span>
					</a>
				</div>
				<div class="logout item-info">
					<a href="logout.jsp"> <i class="fas fa-sign-out-alt"></i> <span>Đăng
							xuất</span>
					</a>
				</div>
			</div>
		</div>
	</div>
</div>