//#include /chess.kojo

clear()
notation()
board()
startingPoint("G1")
diagonalForwardRight()
forward(); backward()
startingPoint("G1")
diagonalForwardLeft()
forward(); backward()
startingPoint("B1")
repeat(2) {forward()}; 
left(); forward(); backward(); right(); backward()
