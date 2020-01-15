<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<title>登录 - 手机端-登录</title>
		<link rel="shortcut icon" href="login/img/favicon.ico" type="image/x-icon" />
		<link rel="stylesheet" href="login/layui/css/layui.css">
		<link rel="stylesheet" href="login/css/login.css">
	</head>

	<body>
		<div class="layui-carousel video_mask" id="login_carousel">
			<div carousel-item>
				<div class="carousel_div1"></div>
				<div class="carousel_div2"></div>
				<div class="carousel_div3"></div>
			</div>
			<div class="login layui-anim layui-anim-up">
				<div class="layui-logo">
					<a href="#" target="_blank"><img src="login/img/logo.png" /></a>
				</div>
				<fieldset class="layui-elem-field layui-field-title">
					<legend class="text-white">用户登录</legend>
				</fieldset>
				<div class="layui-form" action="" method="post">
					<div class="layui-form-item">
						<input type="text" id="account" lay-verify="required|account" maxlength="20" placeholder="请输入手机号" autocomplete="off" autofocus="autofocus" class="layui-input">
					</div>
					<div class="layui-form-item">
						<input type="password" id="password" lay-verify="required" maxlength="20" placeholder="请输入密码" autocomplete="off" class="layui-input">
					</div>
					<div class="layui-form-item form_code" style="display: none;">
						<input type="text" id="code" lay-verify="code" maxlength="6" placeholder="请输入验证码" autocomplete="off" class="layui-input">
						<div class="code"><img id="refCode_login_img" width="118" height="38"></div>
					</div>

					<button class="login_btn layui-btn layui-btn-radius layui-btn-normal" lay-submit lay-filter="login">登录</button>
					<strong class="text-white">还没有账号？ <a href="register.jsp" style="color: cornflowerblue;">立即注册&raquo;</a></strong>
				</div>
				<hr class="layui-bg-gray">
				<div class="layui-footer text-white">
					<!-- 底部固定区域 -->
				</div>
			</div>
		</div>

		<script type="text/javascript" src="login/js/jquery.min.js"></script>
		<script type="text/javascript" src="login/layui/layui.all.js"></script>
		<script type="text/javascript" src="login/js/login.js"></script>
	</body>

</html>