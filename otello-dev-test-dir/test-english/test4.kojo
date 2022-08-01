//#include ui
val size = 4 // or 6 or 8 or 10 or 12
val variant = 0 // or 1
val firstPlayer = Black // or White
val computerPlays = Black // or White or Empty
val board = new EBoard(size, firstPlayer, variant)
clearOutput
ABS.maxDepth = 12 // 8
new UI(board, new History(board), computerPlays)