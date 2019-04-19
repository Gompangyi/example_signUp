<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<form action="insert.me" method="post">
		<div id="container" align="center">
		<br><br>
			<label>아이디 : </label>
			<input type="text" name="user_id" oninput="idCheck()">&nbsp;
			<label id="idCheckAnswer"></label>
			<br><br>
			<label>비밀번호 : </label>
			<input type="password" name="user_pwd">
			<br><br>
			<label>비밀번호 확인 : </label>
			<input type="password" name="userPwd2">
			<br><br>
			<label>이름 : </label>
			<input type="text" name="user_name">
			<br><br>
			<div>
				<label>성별 : </label>
				<input type="radio" name="gender" value="M" id="male"><label> 남 </label>
				<input type="radio" name="gender" value="W" id="female"><label> 여 </label>
			</div>
			<br><br>
			<label>이메일 : </label>
			<input type="email" name="email">
		</div>
		<br><br>
		<div align="center">
			<input type="submit" value="확인">
			<input type="reset" value="취소">
		</div>
	</form>
</body>
<script>
	function idCheck()
	{
		var userId = $("input[name=user_id]").val();
		
		console.log(userId);
		
		if(userId == "" || userId == null)
		{
			document.getElementById("idCheckAnswer").innerHTML = "아이디를 입력하세요.";
		}
		else
		{
			$.ajax(
			{
				data : { "userId" : userId },
				url : 'select.me',
				type : "post",
				success : function(data)
				{
					if(data != userId)
					{
						document.getElementById("idCheckAnswer").innerHTML = "사용 가능한 아이디.";
					}
					else
					{
						document.getElementById("idCheckAnswer").innerHTML = "이미 존재하는 아이디.";
					}
				}
				
			});
		}
	}
</script>
</html>