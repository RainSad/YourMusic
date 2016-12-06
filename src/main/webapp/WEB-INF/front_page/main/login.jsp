<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>YourMusic 登录</title>

        <!-- CSS -->
        <link rel="stylesheet" href="public/login/assets/css/css.css">
        <link rel="stylesheet" href="public/plugin/bootstrap-3.3.0-dist/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="public/login/assets/font-awesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="public/login/assets/css/form-elements.css">
        <link rel="stylesheet" href="public/login/assets/css/style.css">

    </head>

    <body>

        <!-- Top content -->
        <div class="top-content">
        	
            <div class="inner-bg">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-8 col-sm-offset-2 text">
                            <h1><strong>YourMusic</strong> 登录</h1>
                            <!-- 
                            <div class="description">
                            	<p>
	                            	This is a free responsive login form made with Bootstrap. 
	                            	Download it on <a href="http://azmind.com"><strong>AZMIND</strong></a>, customize and use it as you like!
                            	</p>
                            </div>
                             -->
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-6 col-sm-offset-3 form-box">
                        	<div class="form-top">
                        		<div class="form-top-left">
                        			<h3>登录到你的网站</h3>
                            		<p>输入你的用户名和密码进行登录：<c:if test="${isExit == 0 }"><a style="color: red;">无此用户！</a></c:if>
                            		<c:if test="${isExit == 1 }"><a style="color: red;">密码错误！</a></c:if>
                            		<c:if test="${isExit == 2 }">登录成功！</c:if></p>
                        		</div>
                        		<div class="form-top-right">
                        			<i class="fa fa-key"></i>
                        		</div>
                            </div>
                            <div class="form-bottom">
			                    <form role="form" action="login.shtml" method="post" class="login-form">
			                    	<div class="form-group">
			                    		<label class="sr-only" for="form-username">用户名</label>
			                        	<input type="text" name="userId" placeholder="用户名..." class="form-username form-control" id="form-username">
			                        </div>
			                        <div class="form-group">
			                        	<label class="sr-only" for="form-password">密码</label>
			                        	<input type="password" name="passWord" placeholder="密码..." class="form-password form-control" id="form-password">
			                        </div>
			                        <button type="submit" class="btn">登录!</button>
			                    </form>
		                    </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-6 col-sm-offset-3 social-login">
                        	<h3>使用合作账户</h3>
                        	<div class="social-login-buttons">
	                        	<a class="btn btn-link-1 btn-link-1-facebook" href="#">
	                        		<i class="fa fa-qq"></i> QQ
	                        	</a>
	                        	<a class="btn btn-link-1 btn-link-1-twitter" href="#">
	                        		<i class="fa fa-wechat"></i> 微信
	                        	</a>
	                        	<a class="btn btn-link-1 btn-link-1-google-plus" href="#">
	                        		<i class="fa fa-weibo"></i> 微博
	                        	</a>
                        	</div>
                        </div>
                    </div>
                </div>
            </div>
            
        </div>
		<footer>
	        <p class="pull-right"><a href="#">Back to top&nbsp;&nbsp;&nbsp; </a></p>
	        <p class="pull-left">&nbsp;&nbsp;&nbsp;&copy; 2016 Company, Sun &middot; <a href="index.shtml">首页</a> &middot; <a href="#">孙文祥</a></p>
	    </footer>

        <!-- Javascript -->
        <script src="public/plugin/jquery-3.1.1.min.js"></script>
        <script src="public/plugin/bootstrap-3.3.0-dist/dist/js/bootstrap.min.js"></script>
        <script src="public/login/assets/js/jquery.backstretch.min.js"></script>
        <script src="public/login/assets/js/scripts.js"></script>
        
        <!--[if lt IE 10]>
            <script src="assets/js/placeholder.js"></script>
        <![endif]-->

    </body>

</html>