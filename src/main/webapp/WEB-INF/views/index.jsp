<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">

</head>
<body>
	<div class="container">
		<h1>GC CASINO</h1>
		<br>
		<h3>Deck: ${deckId}</h3>

		<br>Loading ${deck.success} 
		<table class="table" border="1">


			<tr>
				<td><img src="${deck.card[0].image }" ></td>
				<td><img src="${deck.card[1].image }" ></td>
				<td><img src="${deck.card[2].image }" ></td>
				<td><img src="${deck.card[3].image }" ></td>
				<td><img src="${deck.card[4].image }" ></td>

			</tr>
			<tr>
				<td>${deck.card[0].value }</td>
				<td>${deck.card[1].value }</td>
				<td>${deck.card[2].value }</td>
				<td>${deck.card[3].value }</td>
				<td>${deck.card[4].value }</td>

			</tr>

		</table>

		<a href="/"><button>Click for a new deck</button></a>
		
	
	</div>
</body>
</html>