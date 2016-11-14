//
//  Matrix.swift
//  FlipMatrix
//
//  Created by Anh Son Le on 11/14/16.
//  Copyright © 2016 Anh Son Le. All rights reserved.
//

import Foundation

class Matrix {
	var rows: Int = 0
	var cols: Int = 0
	var matrix: [[Int]] = []
	
	init() {
		rows = 0
		cols = 0
		matrix = []
	}
	
	init(array: [[Int]]) {
		rows = array.count
		cols = array.first?.count ?? 0
		for i in 0..<rows {
			var rowInt = [Int]()
			for j in 0..<cols {
				rowInt.append(array[i][j])
			}
			matrix.append(rowInt)
		}
	}
	
	//	func flipColume(colIndex: Int) {
	//		if colIndex >= cols {
	//			return
	//		}
	//		for i in 0..<cols/2 {
	//			swap(&matrix[i][colIndex], &matrix[cols - 1 - i][colIndex])
	//		}
	//	}
	//
	//	func flipRow(rowIndex: Int) {
	//		if rowIndex >= rows {
	//			return
	//		}
	//		for i in 0..<rows/2 {
	//			swap(&matrix[rowIndex][i], &matrix[rowIndex][rows - 1 - i])
	//		}
	//	}
	
	func maxFlipMatrix() -> Int {
		var result = 0
		for i in 0..<rows/2 {
			for j in 0..<cols/2 {
				result += max(matrix[i][j], matrix[i][cols - 1 - j], matrix[rows - 1 - i][j], matrix[rows - 1 - i][cols - 1 - j])
			}
		}
		return result
	}
	
}
