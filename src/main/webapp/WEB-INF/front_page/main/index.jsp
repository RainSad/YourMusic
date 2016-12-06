<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="sun">

    <title>首页</title>
    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="public/plugin/bootstrap-3.3.0-dist/dist/css/bootstrap.min.css">
    <!-- Custom styles for this template -->
    <link href="public/css/index.css" rel="stylesheet">
    <link rel="stylesheet" href="public/login/assets/font-awesome/css/font-awesome.min.css">
    <style type="text/css">

    </style>
</head>
<body>
<div class="navbar-wrapper">
    <div class="container">

        <nav class="navbar navbar-inverse navbar-static-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.shtml">YourMusic</a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li><a href="#">推荐</a></li>
                        <li><a href="#about">音乐坊</a></li>
                        <li><a href="#contact">社区</a></li>

                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">个人信息 <span class="caret"></span></a>
                            <ul class="dropdown-menu" role="menu">
                                <li><a href="#">我的音乐</a></li>
                                <li><a href="#">编辑信息</a></li>
                                <li><a href="#">好友</a></li>
                                <li><a href="#">个人信息管理</a></li>
                            </ul>
                        </li>
                        <li calss="navbar-left">
                        
                        </li>

                    </ul>
                    <c:if test="${empty userName}">
                    	<ul class="nav navbar-nav pull-right" >
	                        <li><a href="toLogin.shtml">登录</a></li>
	                        <li><a href="toRegister.shtml">注册</a></li>
                    	</ul>
                    </c:if>
                    <c:if test="${!(empty userName) }">
                    	
                    	<ul class="nav navbar-nav pull-right" >
	                        <li><a><i class="fa fa-user"></i>&nbsp;${userName }</a></li>
	                        <li><a href="exit.shtml"><i class="fa fa-close"></i>退出</a></li>
                    	</ul>
                    </c:if>
                </div>
            </div>
        </nav>

    </div>
</div>


<!-- Carousel
================================================== -->
<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>
    <div class="carousel-inner" role="listbox">
        <div class="item active">
            <img src="public/img/main/lunbo1.jpg" alt="First slide">
            <div class="container">
                <div class="carousel-caption">
                    介绍》》》》》》》》》》》》》》》》》》》》》》》》》
                </div>
            </div>
        </div>
        <div class="item">
            <img src="public/img/main/lunbo2.jpg" alt="Second slide">
            <div class="container">
                <div class="carousel-caption">
                    介绍》》》》》》》》》》》》》》》》》》》》》》》》》
                </div>
            </div>
        </div>
        <div class="item">
            <img src="public/img/main/login_background.jpg" alt="Third slide">
            <div class="container">
                <div class="carousel-caption">
                    介绍》》》》》》》》》》》》》》》》》》》》》》》》》
                </div>
            </div>
        </div>
    </div>
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left"></span>
        <span class="sr-only">上一张</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right"></span>
        <span class="sr-only">下一张</span>
    </a>
</div><!-- /.carousel -->


<!-- Marketing messaging and featurettes
================================================== -->
<!-- Wrap the rest of the page in another container to center all the content. -->

<div class="container marketing">

    <!-- Three columns of text below the carousel -->
    <div class="row">
        <div class="col-lg-4">
            <img class="img-circle" src="public/img/main/icon1.jpg" alt="Generic placeholder image" style="width: 140px; height: 140px;">
            <h2>Heading</h2>
            <p>Donec sed odio dui. Etiam porta sem malesuada magna mollis euismod. Nullam id dolor id nibh ultricies vehicula ut id elit. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Praesent commodo cursus magna.</p>
            <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
            <img class="img-circle" src="public/img/main/icon2.jpg" alt="Generic placeholder image" style="width: 140px; height: 140px;">
            <h2>Heading</h2>
            <p>Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Cras mattis consectetur purus sit amet fermentum. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh.</p>
            <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
            <img class="img-circle" src="public/img/main/icon3.jpg" alt="Generic placeholder image" style="width: 140px; height: 140px;">
            <h2>Heading</h2>
            <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
            <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
        </div><!-- /.col-lg-4 -->
    </div><!-- /.row -->


    <!-- START THE FEATURETTES -->

    <hr class="featurette-divider">

    <div class="row featurette">
        <div class="col-md-7">
            <h2 class="featurette-heading">First featurette heading. <span class="text-muted">It'll blow your mind.</span></h2>
            <p class="lead">Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.</p>
        </div>
        <div class="col-md-5">
            <img class="featurette-image img-responsive" data-src="holder.js/500x500/auto" src="public/img/main/dex1.jpg">
        </div>
    </div>

    <hr class="featurette-divider">

    <div class="row featurette">
        <div class="col-md-5">
            <img class="featurette-image img-responsive" data-src="holder.js/500x500/auto"  src="public/img/main/dex2.jpg">
        </div>
        <div class="col-md-7">
            <h2 class="featurette-heading">Oh yeah, it's that good. <span class="text-muted">See for yourself.</span></h2>
            <p class="lead">Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.</p>
        </div>
    </div>

    <hr class="featurette-divider">

    <div class="row featurette">
        <div class="col-md-7">
            <h2 class="featurette-heading">And lastly, this one. <span class="text-muted">Checkmate.</span></h2>
            <p class="lead">Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.</p>
        </div>
        <div class="col-md-5">
            <img class="featurette-image img-responsive" data-src="holder.js/500x500/auto"  src="public/img/main/dex3.jpeg">
        </div>
    </div>

    <hr class="featurette-divider">

    <!-- /END THE FEATURETTES -->


    <!-- FOOTER -->
    <footer>
        <p class="pull-right"><a href="#">Back to top</a></p>
        <p>&copy; 2016 Company, Sun. &middot; <a href="index.html">首页</a> &middot; <a href="#">孙文祥</a></p>
    </footer>

</div><!-- /.container -->


<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="public/plugin/jquery-3.1.1.min.js"></script>
<script src="public/plugin/bootstrap-3.3.0-dist/dist/js/bootstrap.min.js"></script>
<script type="text/javascript">
	function openNewWindow(){
		window.open("http://localhost:8080/YourMusic/login.shtml");
	}
</script>
</body>
</html>