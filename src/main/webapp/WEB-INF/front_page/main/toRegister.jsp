<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>YourMusic 注册</title>

        <!-- CSS -->
        <link rel="stylesheet" href="public/login/assets/css/css.css">
        <link rel="stylesheet" href="public/plugin/bootstrap-3.3.0-dist/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="public/login/assets/font-awesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="public/login/assets/css/form-elements2.css">
        <link rel="stylesheet" href="public/login/assets/css/style2.css">


    </head>

    <body>

		<!-- Top menu -->
		<nav class="navbar navbar-inverse navbar-no-bg" role="navigation">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#top-navbar-1">
						<span class="sr-only">导航切换</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="index.shtml">首页</a>
				</div>
				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse" id="top-navbar-1">
					<ul class="nav navbar-nav navbar-right">
						<li>
							<span class="li-text">
								输入用户名和密码或者
							</span> 
							<a href="#"><strong>点击</strong></a> 
							<span class="li-text">
								这里, 或者点击图标: 
							</span> 
							<span class="li-social">
								<a href="#"><i class="fa fa-qq"></i></a> 
								<a href="#"><i class="fa fa-wechat"></i></a> 
								<a href="#"><i class="fa fa-weibo"></i></a> 
								<a href="#"><i class="fa fa-github"></i></a>
							</span>
						</li>
					</ul>
				</div>
			</div>
		</nav>

        <!-- Top content -->
        <div class="top-content">
        	
            <div class="inner-bg">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-8 col-sm-offset-2 text">
                            <h1><strong>YourMusic</strong> 注册...</h1>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-6 col-sm-offset-3 form-box">
                        	
                        	<form role="form" action="Register.shtml" method="post" class="registration-form">
                        		
                        		<fieldset>
		                        	<div class="form-top">
		                        		<div class="form-top-left">
		                        			<h3>Step 1 / 3</h3>
		                            		<p>告诉我你是谁: <c:if test="${status == 0 }"><a style="color: red;">此用户名已存在！</a></c:if></p>
		                        		</div>
		                        		<div class="form-top-right">
		                        			<i class="fa fa-user"></i>
		                        		</div>
		                            </div>
		                            <div class="form-bottom">
				                    	<div class="form-group">
				                    		<label class="sr-only" for="form-first-name">昵称</label>
				                        	<input type="text" name="userName" placeholder="昵称..." class="form-first-name form-control" id="form-first-name">
				                        </div>
				                        <div class="form-group">
				                        	<label class="sr-only" for="form-last-name">用户名</label>
				                        	<input type="text" name="userId" placeholder="用户名..." class="form-last-name form-control" id="form-last-name">
				                        </div>
				                        <div class="form-group">
				                        	<label class="sr-only" for="form-about-yourself">关于自己...</label>
				                        	<textarea name="userDiscription" placeholder="关于自己..." 
				                        				class="form-about-yourself form-control" id="form-about-yourself"></textarea>
				                        </div>
				                        <button type="button" class="btn btn-next">下一步</button>
				                    </div>
			                    </fieldset>
			                    
			                    <fieldset>
		                        	<div class="form-top">
		                        		<div class="form-top-left">
		                        			<h3>Step 2 / 3</h3>
		                            		<p>设置你的账户:</p>
		                        		</div>
		                        		<div class="form-top-right">
		                        			<i class="fa fa-key"></i>
		                        		</div>
		                            </div>
		                            <div class="form-bottom">
				                        <div class="form-group">
				                        	<label class="sr-only" for="form-email">性别</label>
				                        	<input type="text" name="sex" placeholder="性别" class="form-email form-control" id="form-email">
				                        </div>
				                        <div class="form-group">
				                    		<label class="sr-only" for="form-password">密码</label>
				                        	<input type="password" name="password" placeholder="密码..." class="form-password form-control" id="form-password">
				                        </div>
				                        <div class="form-group">
				                        	<label class="sr-only" for="form-repeat-password">确认密码</label>
				                        	<input type="password" name="repeatPassword" placeholder="确认密码..." 
				                        				class="form-repeat-password form-control" id="form-repeat-password">
				                        </div>
				                        <button type="button" class="btn btn-previous">上一步</button>
				                        <button type="button" class="btn btn-next">下一步</button>
				                    </div>
			                    </fieldset>
			                    
			                    <fieldset>
		                        	<div class="form-top">
		                        		<div class="form-top-left">
		                        			<h3>Step 3 / 3</h3>
		                            		<p>第三方账户绑定:</p>
		                        		</div>
		                        		<div class="form-top-right">
		                        			<i class="fa fa-check-square"></i>
		                        		</div>
		                            </div>
		                            <div class="form-bottom">
				                    	<div class="form-group">
				                    		<label class="sr-only" for="form-facebook">QQ</label>
				                        	<input type="text" name="qq" placeholder="QQ..." class="form-facebook form-control" id="form-facebook">
				                        </div>
				                        <div class="form-group">
				                        	<label class="sr-only" for="form-twitter">微信</label>
				                        	<input type="text" name="wechat" placeholder="微信..." class="form-twitter form-control" id="form-twitter">
				                        </div>
				                        <div class="form-group">
				                        	<label class="sr-only" for="form-google-plus">微博</label>
				                        	<input type="text" name="weibo" placeholder="微博..." class="form-google-plus form-control" id="form-google-plus">
				                        </div>
				                        <button type="button" class="btn btn-previous">上一步</button>
				                        <button type="submit" class="btn">点我注册!</button>
				                    </div>
			                    </fieldset>
		                    
		                    </form>
		                    
                        </div>
                    </div>
                </div>
            </div>
            
        </div>
		<footer>
	        <p class="pull-right"><a href="#">Back to top&nbsp;&nbsp;&nbsp;</a></p>
	        <p class="pull-left">&nbsp;&nbsp;&nbsp;&copy; 2016 Company, Sun &middot; <a href="index.shtml">首页</a> &middot; <a href="#">孙文祥</a></p>
	    </footer>

        <!-- Javascript -->
        <script src="public/login/assets/js/jquery-1.11.1.min.js"></script>
        <script src="public/plugin/bootstrap-3.3.0-dist/dist/js/bootstrap.min.js"></script>
        <script src="public/login/assets/js/jquery.backstretch.min.js"></script>
        <script src="public/login/assets/js/retina-1.1.0.min.js"></script>
        <script src="public/login/assets/js/scripts2.js"></script>
        
        <!--[if lt IE 10]>
            <script src="assets/js/placeholder.js"></script>
        <![endif]-->

	<script type="text/javascript">
		function emailCheck(){
			
		}
	</script>

    </body>

</html>