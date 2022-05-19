<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<%@ page contentType="text/html; charset=UTF-8" %>
	<head>
		<meta charset="UTF-8" />
		<link rel="stylesheet" href="style.css" />
		<title>Feud Position Evaluator</title>
	</head>
	<body style="background-color : #a3d6a1">
		<form action="./PositionCalculator" method="get" id="form">
			<center>
				<h1>FEUD CALCULATOR by Hisoka</h1>
			</center>
			<h1>For each square you can insert: Piece, Color, and HP. 
			 After submitting you can check if you're winning or losing!</h1>
			<h3>Note: Put '0HP' if the square's empty, or don't put any values.</h3>
			<div class="line">
				<div class="square">
					<br />
					<center>
						<input list="color" name="cA4" />
						<datalist id="color">
							<option value="Black"> </option>
							<option value="White"> </option>
						</datalist>

						<br />
						<br />
						<input list="pieces" name="pA4" />
						<datalist id="pieces">
							<option value="Knight"> </option>
							<option value="Archer"> </option>
							<option value="Healer"> </option>
							<option value="Shield"> </option>
							<option value="Wizard"> </option>
							<option value="King"> </option>
						</datalist>

						<br />
						<br />
						<input list="hp" name="hpA4" />
						<datalist id="hp">
							<option value="0HP"> </option>
							<option value="1HP"> </option>
							<option value="2HP"> </option>
							<option value="3HP"> </option>
							<option value="4HP"> </option>
						</datalist>

						<br />
						<h2>A4</h2>
					</center>
				</div>
				<div class="square">
					<br />
					<center>
						<input list="color" name="cB4" />
						<datalist id="color">
							<option value="Black"> </option>
							<option value="White"> </option>
						</datalist>

						<br />
						<br />
						<input list="pieces" name="pB4" />
						<datalist id="pieces">
							<option value="Knight"> </option>
							<option value="Archer"> </option>
							<option value="Healer"> </option>
							<option value="Shield"> </option>
							<option value="Wizard"> </option>
							<option value="King"> </option>
						</datalist>

						<br />
						<br />
						<input list="hp" name="hpB4" />
						<datalist id="hp">
							<option value="0HP"> </option>
							<option value="1HP"> </option>
							<option value="2HP"> </option>
							<option value="3HP"> </option>
							<option value="4HP"> </option>
						</datalist>

						<h2>B4</h2>
					</center>
				</div>
				<div class="square">
					<br />
					<center>
						<input list="color" name="cC4" />
						<datalist id="color">
							<option value="Black"> </option>
							<option value="White"> </option>
						</datalist>

						<br />
						<br />
						<input list="pieces" name="pC4" />
						<datalist id="pieces">
							<option value="Knight"> </option>
							<option value="Archer"> </option>
							<option value="Healer"> </option>
							<option value="Shield"> </option>
							<option value="Wizard"> </option>
							<option value="King"> </option>
						</datalist>

						<br />
						<br />
						<input list="hp" name="hpC4" />
						<datalist id="hp">
							<option value="0HP"> </option>
							<option value="1HP"> </option>
							<option value="2HP"> </option>
							<option value="3HP"> </option>
							<option value="4HP"> </option>
						</datalist>

						<h2>C4</h2>
					</center>
				</div>
				<div class="square">
					<br />
					<center>
						<input list="color" name="cD4" />
						<datalist id="color">
							<option value="Black"> </option>
							<option value="White"> </option>
						</datalist>

						<br />
						<br />
						<input list="pieces" name="pD4" />
						<datalist id="pieces">
							<option value="Knight"> </option>
							<option value="Archer"> </option>
							<option value="Healer"> </option>
							<option value="Shield"> </option>
							<option value="Wizard"> </option>
							<option value="King"> </option>
						</datalist>

						<br />
						<br />
						<input list="hp" name="hpD4" />
						<datalist id="hp">
							<option value="0HP"> </option>
							<option value="1HP"> </option>
							<option value="2HP"> </option>
							<option value="3HP"> </option>
							<option value="4HP"> </option>
						</datalist>

						<h2>D4</h2>
					</center>
				</div>
				<br />
				<h1></h1>
				<div class="line">
					<div class="square">
						<br />
						<center>
							<input list="color" name="cA3" />
							<datalist id="color">
								<option value="Black"> </option>
								<option value="White"> </option>
							</datalist>

							<br />
							<br />
							<input list="pieces" name="pA3" />
							<datalist id="pieces">
								<option value="Knight"> </option>
								<option value="Archer"> </option>
								<option value="Healer"> </option>
								<option value="Shield"> </option>
								<option value="Wizard"> </option>
								<option value="King"> </option>
							</datalist>

							<br />
							<br />
							<input list="hp" name="hpA3" />
							<datalist id="hp">
								<option value="0HP"> </option>
								<option value="1HP"> </option>
								<option value="2HP"> </option>
								<option value="3HP"> </option>
								<option value="4HP"> </option>
							</datalist>

							<h2>A3</h2>
						</center>
					</div>
					<div class="square">
						<br />
						<center>
							<input list="color" name="cB3" />
							<datalist id="color">
								<option value="Black"> </option>
								<option value="White"> </option>
							</datalist>

							<br />
							<br />
							<input list="pieces" name="pB3" />
							<datalist id="pieces">
								<option value="Knight"> </option>
								<option value="Archer"> </option>
								<option value="Healer"> </option>
								<option value="Shield"> </option>
								<option value="Wizard"> </option>
								<option value="King"> </option>
							</datalist>

							<br />
							<br />
							<input list="hp" name="hpB3" />
							<datalist id="hp">
								<option value="0HP"> </option>
								<option value="1HP"> </option>
								<option value="2HP"> </option>
								<option value="3HP"> </option>
								<option value="4HP"> </option>
							</datalist>

							<h2>B3</h2>
						</center>
					</div>
					<div class="square">
						<br />
						<center>
							<input list="color" name="cC3" />
							<datalist id="color">
								<option value="Black"> </option>
								<option value="White"> </option>
							</datalist>

							<br />
							<br />
							<input list="pieces" name="pC3" />
							<datalist id="pieces">
								<option value="Knight"> </option>
								<option value="Archer"> </option>
								<option value="Healer"> </option>
								<option value="Shield"> </option>
								<option value="Wizard"> </option>
								<option value="King"> </option>
							</datalist>

							<br />
							<br />
							<input list="hp" name="hpC3" />
							<datalist id="hp">
								<option value="0HP"> </option>
								<option value="1HP"> </option>
								<option value="2HP"> </option>
								<option value="3HP"> </option>
								<option value="4HP"> </option>
							</datalist>

							<h2>C3</h2>
						</center>
					</div>
					<div class="square">
						<br />
						<center>
							<input list="color" name="cD3" />
							<datalist id="color">
								<option value="Black"> </option>
								<option value="White"> </option>
							</datalist>

							<br />
							<br />
							<input list="pieces" name="pD3" />
							<datalist id="pieces">
								<option value="Knight"> </option>
								<option value="Archer"> </option>
								<option value="Healer"> </option>
								<option value="Shield"> </option>
								<option value="Wizard"> </option>
								<option value="King"> </option>
							</datalist>

							<br />
							<br />
							<input list="hp" name="hpD3" />
							<datalist id="hp">
								<option value="0HP"> </option>
								<option value="1HP"> </option>
								<option value="2HP"> </option>
								<option value="3HP"> </option>
								<option value="4HP"> </option>
							</datalist>

							<h2>D3</h2>
						</center>
					</div>
				</div>
				<br />
				<h1></h1>
				<div class="square">
					<br />
					<center>
						<input list="color" name="cA2" />
						<datalist id="color">
							<option value="Black"> </option>
							<option value="White"> </option>
						</datalist>

						<br />
						<br />
						<input list="pieces" name="pA2" />
						<datalist id="pieces">
							<option value="Knight"> </option>
							<option value="Archer"> </option>
							<option value="Healer"> </option>
							<option value="Shield"> </option>
							<option value="Wizard"> </option>
							<option value="King"> </option>
						</datalist>

						<br />
						<br />
						<input list="hp" name="hpA2" />
						<datalist id="hp">
							<option value="0HP"> </option>
							<option value="1HP"> </option>
							<option value="2HP"> </option>
							<option value="3HP"> </option>
							<option value="4HP"> </option>
						</datalist>

						<h2>A2</h2>
					</center>
				</div>
				<div class="square">
					<br />
					<center>
						<input list="color" name="cB2" />
						<datalist id="color">
							<option value="Black"> </option>
							<option value="White"> </option>
						</datalist>

						<br />
						<br />
						<input list="pieces" name="pB2" />
						<datalist id="pieces">
							<option value="Knight"> </option>
							<option value="Archer"> </option>
							<option value="Healer"> </option>
							<option value="Shield"> </option>
							<option value="Wizard"> </option>
							<option value="King"> </option>
						</datalist>

						<br />
						<br />
						<input list="hp" name="hpB2" />
						<datalist id="hp">
							<option value="0HP"> </option>
							<option value="1HP"> </option>
							<option value="2HP"> </option>
							<option value="3HP"> </option>
							<option value="4HP"> </option>
						</datalist>

						<h2>B2</h2>
					</center>
				</div>
				<div class="square">
					<br />
					<center>
						<input list="color" name="cC2" />
						<datalist id="color">
							<option value="Black"> </option>
							<option value="White"> </option>
						</datalist>

						<br />
						<br />
						<input list="pieces" name="pC2" />
						<datalist id="pieces">
							<option value="Knight"> </option>
							<option value="Archer"> </option>
							<option value="Healer"> </option>
							<option value="Shield"> </option>
							<option value="Wizard"> </option>
							<option value="King"> </option>
						</datalist>

						<br />
						<br />
						<input list="hp" name="hpC2" />
						<datalist id="hp">
							<option value="0HP"> </option>
							<option value="1HP"> </option>
							<option value="2HP"> </option>
							<option value="3HP"> </option>
							<option value="4HP"> </option>
						</datalist>

						<h2>C2</h2>
					</center>
				</div>
				<div class="square">
					<br />
					<center>
						<input list="color" name="cD2" />
						<datalist id="color">
							<option value="Black"> </option>
							<option value="White"> </option>
						</datalist>

						<br />
						<br />
						<input list="pieces" name="pD2" />
						<datalist id="pieces">
							<option value="Knight"> </option>
							<option value="Archer"> </option>
							<option value="Healer"> </option>
							<option value="Shield"> </option>
							<option value="Wizard"> </option>
							<option value="King"> </option>
						</datalist>

						<br />
						<br />
						<input list="hp" name="hpD2" />
						<datalist id="hp">
							<option value="0HP"> </option>
							<option value="1HP"> </option>
							<option value="2HP"> </option>
							<option value="3HP"> </option>
							<option value="4HP"> </option>
						</datalist>

						<h2>D2</h2>
					</center>
				</div>
				<br />
				<h1></h1>
				<div class="line">
					<div class="square">
						<br />
						<center>
							<input list="color" name="cA1" />
							<datalist id="color">
								<option value="Black"> </option>
								<option value="White"> </option>
							</datalist>

							<br />
							<br />
							<input list="pieces" name="pA1" />
							<datalist id="pieces">
								<option value="Knight"> </option>
								<option value="Archer"> </option>
								<option value="Healer"> </option>
								<option value="Shield"> </option>
								<option value="Wizard"> </option>
								<option value="King"> </option>
							</datalist>

							<br />
							<br />
							<input list="hp" name="hpA1" />
							<datalist id="hp">
								<option value="0HP"> </option>
								<option value="1HP"> </option>
								<option value="2HP"> </option>
								<option value="3HP"> </option>
								<option value="4HP"> </option>
							</datalist>

							<h2>A1</h2>
						</center>
					</div>
					<div class="square">
						<br />
						<center>
							<input list="color" name="cB1" />
							<datalist id="color">
								<option value="Black"> </option>
								<option value="White"> </option>
							</datalist>

							<br />
							<br />
							<input list="pieces" name="pB1" />
							<datalist id="pieces">
								<option value="Knight"> </option>
								<option value="Archer"> </option>
								<option value="Healer"> </option>
								<option value="Shield"> </option>
								<option value="Wizard"> </option>
								<option value="King"> </option>
							</datalist>

							<br />
							<br />
							<input list="hp" name="hpB1" />
							<datalist id="hp">
								<option value="0HP"> </option>
								<option value="1HP"> </option>
								<option value="2HP"> </option>
								<option value="3HP"> </option>
								<option value="4HP"> </option>
							</datalist>

							<h2>B1</h2>
						</center>
					</div>
					<div class="square">
						<br />
						<center>
							<input list="color" name="cC1" />
							<datalist id="color">
								<option value="Black"> </option>
								<option value="White"> </option>
							</datalist>

							<br />
							<br />
							<input list="pieces" name="pC1" />
							<datalist id="pieces">
								<option value="Knight"> </option>
								<option value="Archer"> </option>
								<option value="Healer"> </option>
								<option value="Shield"> </option>
								<option value="Wizard"> </option>
								<option value="King"> </option>
							</datalist>

							<br />
							<br />
							<input list="hp" name="hpC1" />
							<datalist id="hp">
								<option value="0HP"> </option>
								<option value="1HP"> </option>
								<option value="2HP"> </option>
								<option value="3HP"> </option>
								<option value="4HP"> </option>
							</datalist>

							<h2>C1</h2>
						</center>
					</div>
					<div class="square">
						<br />
						<center>
							<input list="color" name="cD1" />
							<datalist id="color">
								<option value="Black"> </option>
								<option value="White"> </option>
							</datalist>

							<br />
							<br />
							<input list="pieces" name="pD1" />
							<datalist id="pieces">
								<option value="Knight"> </option>
								<option value="Archer"> </option>
								<option value="Healer"> </option>
								<option value="Shield"> </option>
								<option value="Wizard"> </option>
								<option value="King"> </option>
							</datalist>

							<br />
							<br />
							<input list="hp" name="hpD1" />
							<datalist id="hp">
								<option value="0HP"> </option>
								<option value="1HP"> </option>
								<option value="2HP"> </option>
								<option value="3HP"> </option>
								<option value="4HP"> </option>
							</datalist>

							<h2>D1</h2>
						</center>
					</div>
					<br />
					<center>
						<h2>Now is Black's turn or White's turn?</h2>
						<input list="turn" name="turn" />
						<datalist id="turn">
							<option value="Black"> </option>
							<option value="White"> </option>
						</datalist>

						<input type="submit" />
					</center>
				</div>
			</div>
		</form>
	</body>
</html>
