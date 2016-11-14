//
//  main.swift
//  FlipMatrix
//
//  Created by Anh Son Le on 11/14/16.
//  Copyright © 2016 Anh Son Le. All rights reserved.
//

import Foundation

var rawN = ConsoleIO.inputInt(string: nil)
var n = 0
while rawN == nil {
	print("Enter n: ", terminator:"")
	rawN = ConsoleIO.inputInt(string: nil)
}

n = rawN!

var arrayMatrix = ConsoleIO.inputMatrix(dimMatrix: 2*n)

var matrix = Matrix(array: arrayMatrix)

let result = matrix.maxFlipMatrix()

print(result)
