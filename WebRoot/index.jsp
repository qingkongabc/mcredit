<%@ page language="java" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
  <meta charset="UTF-8">
  <title>Basic Layout - jQuery EasyUI Demo</title>
  <link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
  <link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
  <link rel="stylesheet" type="text/css" href="easyui/demo.css">
  <script type="text/javascript" src="easyui/jquery.min.js"></script>
  <script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
</head>

<body class="easyui-layout">
  <div data-options="region:'north',border:false" style="height:58px;background:url('images/top_01.png');padding:10px;overflow-y: hidden;">
    <img src="images/top_logo.png">
  </div>
  <div data-options="region:'west',split:true,title:'菜单'" style="width:250px;padding:10px;">
    <ul class="easyui-tree" data-options="animate:true,lines:true">
      <li>
        <span>查询</span>
        <ul>
          <li>
            <span>快捷查询</span>
          </li>
          <li>
            <span>客户微贷查询</span>
          </li>
          <li>
            <span>电话回访查询</span>
          </li>
        </ul>
      </li>
      <li data-options="state:'closed'">
        <span>报表</span>
        <ul>
          <li>电话回访报表</li>
          <li>电话回访接通</li>
          <li>电话回访配合程度</li>
          <li>客户留存率</li>
          <li>全部留存率</li>
          <li>全部留存率纵向比较</li>
        </ul>
      </li>
      <li data-options="state:'closed'">
        <span>导入数据</span>
        <ul>
          <li>导入数据</li>
          <li>清除数据</li>
        </ul>
      </li>
      <li data-options="state:'closed'">
        <span>系统管理</span>
        <ul>
          <li>修改密码</li>
          <li>用户管理</li>
          <li>权限管理</li>
        </ul>
      </li>
    </ul>
  </div>
  <div data-options="region:'east',split:true,collapsed:true,title:'East'" style="width:100px;padding:10px;"></div>
  < data-options="region:'south',border:false" style="height:50px;background:#A9FACD;padding:10px;">south region<a href="/user/getAllUser">进入用户管理页</a></div>
  <div data-options="region:'center',title:'Center'"></div>
  <div data-options="region:'south',border:false" style="height:30px;background:url('images/top_01.png');padding:10px;overflow-y: hidden;">
    版权所有
  </div>
</body>
</html>