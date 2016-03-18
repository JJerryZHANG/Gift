<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/LoginCheck.jsp"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%
	String userName = (String) session.getAttribute("userName");
	String NameNum1 = (String) session.getAttribute("NameNum1");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="<%=path%>/css/templatemo_style.css"
	type="text/css" />
<link rel="stylesheet" href="<%=path%>/css/orman.css" type="text/css"
	media="screen" />
<link rel="stylesheet" href="<%=path%>/css/ddsmoothmenu.css"
	type="text/css" />
<link rel="stylesheet" href="<%=path%>/css/story.css" type="text/css" />
<script type="text/javascript" src="js/main.js"></script>
<title>Advertisement Page</title>
</head>
<body>

	<div>
		<h3>
			你好,<a href="SearchServlet?keyword=<%=userName%>"><%=userName%></a>
			&nbsp;&nbsp;&nbsp; <a href="<%=basePath%>Logout.jsp">注销</a>| <a
				href="<%=basePath%>Register.jsp">注册</a>| <a
				href="<%=basePath%>Login.jsp">登陆</a>
		</h3>
	</div>


	<div id="templatemo_wrapper_h">
		<div id="templatemo_header_wh">
			<div id="templatemo_header" class="header_home">
				<div id="site_title">
					<a></a>

				</div>
				<div id="templatemo_menu" class="ddsmoothmenu">
					<!-- 标题栏 -->
					<ul>
						<li><a href="servlet/HotGiftServlet" class="selected">主页</a></li>
						<li><a href="javascript:DisplaySubnav1();">TA是谁</a>
							<ul id="subnav1">
								<li><a href="servlet/GiftServlet?id=old">老人</a></li>
								<!-- 此处为用于查找的条件，这个条件传到GiftDao.java用于数据库查询 -->
								<li><a href="servlet/GiftServlet?id=adult">成年</a></li>
								<li><a href="servlet/GiftServlet?id=young">青少年</a></li>
								<li><a href="servlet/GiftServlet?id=children">儿童</a></li>
								<li><a href="servlet/GiftServlet?id=baby">婴儿</a></li>
							</ul></li>
						<li><a href="javascript:DisplaySubnav2();">什么日子</a>
							<ul id="subnav2">
								<li><a href="servlet/GiftServlet?id=spring">春节</a></li>
								<li><a href="servlet/GiftServlet?id=moon">中秋</a></li>
								<li><a href="servlet/GiftServlet?id=birthday">生日</a></li>
								<li><a href="servlet/GiftServlet?id=marry">结婚</a></li>
								<li><a href="servlet/GiftServlet?id=love">七夕</a></li>
								<li><a href="servlet/GiftServlet?id=move">乔迁</a></li>
							</ul></li>
						<li><a href="javascript:DisplaySubnav3();">TA的个性</a>
							<ul id="subnav3">
								<li><a href="servlet/GiftServlet?id=cute">可爱</a></li>
								<li><a href="servlet/GiftServlet?id=eat">吃货</a></li>
								<li><a href="servlet/GiftServlet?id=cartoon">动漫迷</a></li>
								<li><a href="servlet/GiftServlet?id=tech">科技迷</a></li>
								<li><a href="servlet/GiftServlet?id=art">文艺范</a></li>
								<li><a href="servlet/GiftServlet?id=beauty">爱美</a></li>
							</ul></li>
						<li><a href="servlet/ToMessageBoard">留言板</a></li>
					</ul>


					<div id="templatemo_search">
						<form action="SearchServlet" method="post">
							<input type="text" name="keyword" id="keyword" title="keyword"
								onfocus="clearText(this)" onblur="clearText(this)"
								class="txt_field" /> <input type="submit" name="Search"
								value="" alt="Search" id="searchbutton" title="Search"
								class="sub_btn" />
						</form>
					</div>

					<br style="clear: left" />
				</div>

				<!-- end of templatemo_menu -->

				<!-- 滚动横幅 -->
				<div class="slider-wrapper theme-orman">
				<img alt="" src="<%=path%>/images/header.jpg">
				</div>
				
			</div>
			<!-- END of header -->
		</div>
		<!-- END of header wrapper -->
		<div id="templatemo_main_wrapper">
			<div id="templatemo_main">
				<div id="sidebar" class="left">
					<div class="sidebar_box">
						<span class="bottom"></span>
						<h3>Advertisement Area</h3>
						<div class="content">
							<ul class="sidebar_list1" id="sidebar_list1">
								<li><a href="servlet/StoryServlet?id=1">Ad of KFC</a></li>
								<li><a href="servlet/StoryServlet?id=2">Ad of Coca Cola</a></li>
								<li><a href="servlet/StoryServlet?id=3"></a></li>
								<li><a href="servlet/StoryServlet?id=4"></a></li>
								<li><a href="servlet/StoryServlet?id=5"></a></li>
								<li><a href="servlet/StoryServlet?id=6"></a></li>
								<li><a href="servlet/StoryServlet?id=7"></a></li>
								<li><a href="servlet/StoryServlet?id=8"></a></li>
								<li><a href="servlet/StoryServlet?id=9"></a></li>
							</ul>
							<ul class="sidebar_list2" id="sidebar_list2">
								<li><a href="servlet/StoryServlet?id=10"></a></li>
								<li><a href="servlet/StoryServlet?id=11"></a></li>
								<li><a href="servlet/StoryServlet?id=12"></a></li>
								<li><a href="servlet/StoryServlet?id=13"></a></li>
								<li><a href="servlet/StoryServlet?id=14"></a></li>
								<li><a href="servlet/StoryServlet?id=15"></a></li>
								<li><a href="servlet/StoryServlet?id=16"></a></li>
								<li><a href="servlet/StoryServlet?id=17"></a></li>
								<li><a href="servlet/StoryServlet?id=18"></a></li>
							</ul>
						</div>
						<%--分页 --%>
						<div>
							<sapn> &lt; </sapn>
							<a href="javascript:page1();">1</a> 
							<a href="javascript:page2();">2</a>
							<sapn> &gt; </sapn>
						</div>
					</div>

					<!-- 热门礼物 -->
					<div class="sidebar_box">
						<span class="bottom"></span>
						<h3>最受欢迎的礼物</h3>
						<div class="content special">
							<img src="images/product/<%=session.getAttribute("HotPic")%>"
								alt="Flowers" /> <a href="<%=session.getAttribute("HotLink")%>">购买链接</a>
							<p>
								<span class="price special_price"><%=session.getAttribute("HotName")%></span>
							</p>
						</div>
					</div>
				</div>

				<div id="content" class="right">
					<h2>Advertisement</h2>
					<!-- PicNum1=a[1] 此处将查询得到的数组数据赋值给PicNum1用于显示-->

					<div id="stitle"><h3><a href="#"><%=session.getAttribute("StoryTitle")%></a></h3></div>
					<iframe
						src='<%=path%>/txt/story_txt/<%=session.getAttribute("StoryContent")%>'></iframe>
					<div height="30px">&nbsp;</div>
					<div id="gift_related">
						相关礼品推荐： <a
							href="GiftdetailServlet?gName=<%=session.getAttribute("related1")%>"><%=session.getAttribute("related1")%></a>
						<a
							href="GiftdetailServlet?gName=<%=session.getAttribute("related2")%>"><%=session.getAttribute("related2")%></a>
						<a
							href="GiftdetailServlet?gName=<%=session.getAttribute("related3")%>"><%=session.getAttribute("related3")%></a>
						<a
							href="GiftdetailServlet?gName=<%=session.getAttribute("related4")%>"><%=session.getAttribute("related4")%></a>
						<a
							href="GiftdetailServlet?gName=<%=session.getAttribute("related5")%>"><%=session.getAttribute("related5")%></a>

					</div>
					<div class="blank_box">
						<a href="#"><img src="<%=path%>/images/free_shipping.jpg"
							alt="Free Shipping" /></a>
					</div>
				</div>


				<div class="cleaner"></div>
			</div>
			<!-- END of main -->
		</div>
		<!-- END of main wrapper -->

		<!-- 页尾 -->
		<div id="templatemo_footer_wrapper">
			<div id="templatemo_footer">
				<div class="footer_left">&nbsp;</div>
				<div class="footer">
					<p>
						版权属于 <a href="#">HONG KONG POLYU COMP 5321 /a>
					</p>
				</div>
				<div class="footer_right">&nbsp;</div>
				<div class="cleaner"></div>
			</div>
			<!-- END of footer -->
		</div>
		<!-- END of footer wrapper -->
	</div>
</body>

</html>