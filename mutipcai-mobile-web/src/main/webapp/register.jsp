<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<title>注册 - 手机端-注册</title>
		<link rel="shortcut icon" href="login/img/favicon.ico" type="image/x-icon" />
		<link rel="stylesheet" href="login/layui/css/layui.css">
		<link rel="stylesheet" href="login/css/register.css">
	</head>

	<body style="background-image: url(login/img/login-bg2.jpg);">
		<div class="layui-main user">
			<div class="layui-clear main">
				<div class="layui-logo">
					<a href="#" target="_blank"><img src="login/img/logo.png" /></a>
				</div>
				<fieldset class="layui-elem-field layui-field-title">
					<legend class="text-white">用户注册</legend>
				</fieldset>
				<div class="layui-form layui-form-pane">
					<div class="layui-form">
						<div class="layui-form-item">
							<input class="layui-input" id="phone" placeholder="请输入手机号" type="text" maxlength="11" lay-verify="required|phone|regexit" autofocus="autofocus" autocomplete="off">
						</div>
						<div class="layui-form-item">
							<input class="layui-input" id="password" placeholder="请输入密码" type="password" maxlength="20" lay-verify="required|pwd" autocomplete="off">
						</div>
						<div class="layui-form-item">
							<input class="layui-input" placeholder="请再次输入密码" type="password" maxlength="20" lay-verify="required|rePwd" autocomplete="off">
						</div>
						<div class="layui-form-item form_code" style="display: none;">
							<input id="code" class="layui-input" placeholder="请输入图片验证码" type="text" maxlength="6" lay-verify="code">
							<div class="code"><img id="refCode_reg_img" width="120" height="38"></div>
						</div>
						<div class="layui-form-item form_code" style="display: none;">
							<input id="msg-code" class="layui-input" placeholder="请输入短信验证码" type="text" maxlength="6" lay-verify="number|msgcode">
							<div class="code">
								<a id="msg-btn" class="layui-btn layui-btn-normal tel-btn" style="width: 120px;">获取验证码</a>
							</div>
						</div>
						<div class="layui-form-item" style="float: left;margin-left: -10px;">
							<input lay-filter="agreen-checkbox" title="我同意"  type="checkbox" lay-skin="primary" checked>
							<a href="userxieyi.jsp" target="_blank">《注册协议》</a>
						</div>
						<div class="layui-form-item">
							<button id="reg" type="submit" class="login_btn layui-btn layui-btn-radius layui-btn-normal" lay-submit lay-filter="register">立即注册</button>
						</div>
						<div>
							<small class="text-white">已经有账户了？</small>
							<a href="login.jsp">点此登录</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</body>

	<script type="text/javascript" src="login/js/jquery.min.js"></script>
	<script type="text/javascript" src="login/layui/layui.all.js"></script>
	<script type="text/javascript" src="login/js/register.js"></script>

</html>