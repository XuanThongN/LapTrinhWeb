<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>My Beautiful Page</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<style>
		body {
			font-family: Arial, sans-serif;
			font-size: 16px;
			line-height: 1.5;
			margin: 0;
			padding: 0;
			background-color: #f6f6f6;
			color: #333;
		}
		header {
			background-color: #333;
			color: #fff;
			padding: 20px;
			text-align: center;
		}
		h1 {
			font-size: 48px;
			margin-bottom: 20px;
			text-shadow: 2px 2px #000;
		}
		nav {
			display: flex;
			justify-content: center;
			margin-bottom: 20px;
		}
		nav a {
			color: #fff;
			font-size: 24px;
			margin: 0 20px;
			text-decoration: none;
			text-transform: uppercase;
			transition: all 0.3s ease-in-out;
		}
		nav a:hover {
			color: #f6f6f6;
			text-shadow: 2px 2px #000;
		}
		main {
			padding: 20px;
			display: flex;
			flex-direction: column;
			align-items: center;
			text-align: center;
		}
		p {
			font-size: 24px;
			margin-bottom: 20px;
			line-height: 1.5;
			max-width: 800px;
		}
		.image-container {
			display: flex;
			flex-wrap: wrap;
			justify-content: center;
			margin-top: 20px;
		}
		.image-container img {
			width: 300px;
			height: 200px;
			object-fit: cover;
			margin: 10px;
			border-radius: 10px;
			box-shadow: 0 0 10px rgba(0,0,0,0.3);
			transition: all 0.3s ease-in-out;
		}
		.image-container img:hover {
			transform: scale(1.1);
			box-shadow: 0 0 20px rgba(0,0,0,0.5);
		}
		footer {
			background-color: #333;
			color: #fff;
			padding: 10px;
			text-align: center;
			position: fixed;
			bottom: 0;
			width: 100%;
		}
	</style>
</head>
<body>
	<%@ include file = "header.html" %>
	<main>
		<p>This is the main content of my page.</p>
		<p>It can include text, images, videos, and other types of media.</p>
		<div class="image-container">
			<img src="https://picsum.photos/id/237/300/200" alt="Image 1">
			<img src="https://picsum.photos/id/238/300/200" alt="Image 2">
			<img src="https://picsum.photos/id/239/300/200" alt="Image 3">
			<img src="https://picsum.photos/id/240/300/200" alt="Image 4">
			<img src="https://picsum.photos/id/241/300/200" alt="Image 5">
			<img src="https://picsum.photos/id/242/300/200" alt="Image 6">
		</div>
	</main>
	<%@ include file = "footer.html" %>
</body>
</html>