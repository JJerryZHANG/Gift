<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/LoginCheck.jsp"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%
	String userName = (String) session.getAttribute("userName");
	//String NameNum1 = (String) session.getAttribute("NameNum1");
	//String ghotone = (String) session.getAttribute("ghotone");//传过来的值要求是ghot1
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
<script type="text/javascript" src="js/main.js"></script>
<title>Insert title here</title>
</head>
<body>

	<div>
		<h3>
			你好,<a href="SearchServlet?keyword=<%=userName%>"><%=userName%> </a>
			&nbsp;&nbsp;&nbsp; <a href="<%=basePath%>Logout.jsp">注销</a>| <a
				href="<%=basePath%>Register.jsp">注册</a>| <a
				href="<%=basePath%>Login.jsp">登陆</a>
		</h3>
	</div>

	<div id="templatemo_wrapper_h">
		<div id="templatemo_header_wh">
			<div id="templatemo_header" class="header_home">
				<div id="site_title"></div>
				<div id="templatemo_menu" class="ddsmoothmenu">
					<!-- 标题栏 -->
					<ul>
						<li><a href="servlet/HotGiftServlet" class="selected">主页</a></li>
						<li><a href="javascript:DisplaySubnav1();">TA是谁</a>
							<ul id="subnav1">
								<li><a href="servlet/GiftServlet?id=old">老人</a></li>
								<!-- 此处为用于查找的条件，这个条件传到GiftDao.java用于数据库查询 -->
								<li><a href="servlet/GiftServlet?id=adult">成年</a></li>
								<li><a href="servlet/GiftServlet?id=young">青年</a></li>
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
						<form action="servlet/SearchServlet" method="post">
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
							<a href="javascript:page1();">1</a> <a href="javascript:page2();">2</a>
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
					<h2>选择你喜欢的礼物吧</h2>
					<!-- PicNum1=a[1] 此处将查询得到的数组数据赋值给PicNum1用于显示-->
					<div class="product_box">

						<a><img
							src="images/product/<%=session.getAttribute("PicNum1")%>"
							alt="floral set 1" /></a>
						<h3><%=session.getAttribute("NameNum1")%></h3>
						<p class="product_price">
							<a href="<%=session.getAttribute("LinkNum1")%>" target="_blank">购买连接</a>
						</p>
						<p class="add_to_cart">
							<a
								href="servlet/GiftdetailServlet?gName=<%=session.getAttribute("NameNum1")%>">介绍</a>
							<a
								href="servlet/ZanServlet?mark=1&GiftName=<%=session.getAttribute("NameNum1")%>">点赞(<%=session.getAttribute("ghot1")%>)
							</a>
						</p>
					</div>
					<div class="product_box">
						<a><img
							src="images/product/<%=session.getAttribute("PicNum2")%>"
							alt="flowers 2" /></a>
						<h3><%=session.getAttribute("NameNum2")%></h3>
						<p class="product_price">
							<a href="<%=session.getAttribute("LinkNum2")%>" target="_blank">购买连接</a>
						</p>
						<p class="add_to_cart">
							<a
								href="servlet/GiftdetailServlet?gName=<%=session.getAttribute("NameNum2")%>">介绍</a>
							<a
								href="servlet/ZanServlet?mark=2&GiftName=<%=session.getAttribute("NameNum2")%>">点赞(<%=session.getAttribute("ghot2")%>)
							</a>
						</p>
					</div>
					<div class="product_box">
						<a><img
							src="images/product/<%=session.getAttribute("PicNum3")%>"
							alt="floral 3" /></a>
						<h3><%=session.getAttribute("NameNum3")%></h3>
						<p class="product_price">
							<a href="<%=session.getAttribute("LinkNum3")%>" target="_blank">购买连接</a>
						</p>
						<p class="add_to_cart">
							<a
								href="servlet/GiftdetailServlet?gName=<%=session.getAttribute("NameNum3")%>">介绍</a>
							<a
								href="servlet/ZanServlet?mark=3&GiftName=<%=session.getAttribute("NameNum3")%>">点赞(<%=session.getAttribute("ghot3")%>)
							</a>
						</p>
					</div>
					<div class="product_box no_margin_right">
						<a><img
							src="images/product/<%=session.getAttribute("PicNum4")%>"
							alt="flowers 4" /></a>
						<h3><%=session.getAttribute("NameNum4")%></h3>
						<p class="product_price">
							<a href="<%=session.getAttribute("LinkNum4")%>" target="_blank">购买连接</a>
						</p>
						<p class="add_to_cart">
							<a
								href="servlet/GiftdetailServlet?gName=<%=session.getAttribute("NameNum4")%>">介绍</a>
							<a
								href="servlet/ZanServlet?mark=4&GiftName=<%=session.getAttribute("NameNum4")%>">点赞(<%=session.getAttribute("ghot4")%>)
							</a>
						</p>
					</div>

					<div class="product_box">
						<a><img
							src="images/product/<%=session.getAttribute("PicNum5")%>"
							alt="floral set 5" /></a>
						<h3><%=session.getAttribute("NameNum5")%></h3>
						<p class="product_price">
							<a href="<%=session.getAttribute("LinkNum5")%>" target="_blank">购买连接</a>
						</p>
						<p class="add_to_cart">
							<a
								href="servlet/GiftdetailServlet?gName=<%=session.getAttribute("NameNum5")%>">介绍</a>
							<a
								href="servlet/ZanServlet?mark=5&GiftName=<%=session.getAttribute("NameNum5")%>">点赞(<%=session.getAttribute("ghot5")%>)
							</a>
						</p>
					</div>
					<div class="product_box">
						<a><img
							src="images/product/<%=session.getAttribute("PicNum6")%>"
							alt="flowers 7" /></a>
						<h3><%=session.getAttribute("NameNum6")%></h3>
						<p class="product_price">
							<a href="<%=session.getAttribute("LinkNum6")%>" target="_blank">购买连接</a>
						</p>
						<p class="add_to_cart">
							<a
								href="servlet/GiftdetailServlet?gName=<%=session.getAttribute("NameNum6")%>">介绍</a>
							<a
								href="servlet/ZanServlet?mark=6&GiftName=<%=session.getAttribute("NameNum6")%>">点赞(<%=session.getAttribute("ghot6")%>)
							</a>
						</p>
					</div>
					<div class="product_box">
						<a><img
							src="images/product/<%=session.getAttribute("PicNum7")%>"
							alt="flower set 6" /></a>
						<h3><%=session.getAttribute("NameNum7")%></h3>
						<p class="product_price">
							<a href="<%=session.getAttribute("LinkNum7")%>" target="_blank">购买连接</a>
						</p>
						<p class="add_to_cart">
							<a
								href="servlet/GiftdetailServlet?gName=<%=session.getAttribute("NameNum7")%>">介绍</a>
							<a
								href="servlet/ZanServlet?mark=7&GiftName=<%=session.getAttribute("NameNum7")%>">点赞(<%=session.getAttribute("ghot7")%>)
							</a>
						</p>
					</div>
					<div class="product_box no_margin_right">
						<a><img
							src="images/product/<%=session.getAttribute("PicNum8")%>"
							alt="floral 8" /></a>
						<h3><%=session.getAttribute("NameNum8")%></h3>
						<p class="product_price">
							<a href="<%=session.getAttribute("LinkNum8")%>" target="_blank">购买连接</a>
						</p>
						<p class="add_to_cart">
							<a
								href="servlet/GiftdetailServlet?gName=<%=session.getAttribute("NameNum8")%>">介绍</a>
							<a
								href="servlet/ZanServlet?mark=8&GiftName=<%=session.getAttribute("NameNum8")%>">点赞(<%=session.getAttribute("ghot8")%>)
							</a>
						</p>
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
						版权属于 <a href="#">HONG KONG POLYU COMP 5321 </a>
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