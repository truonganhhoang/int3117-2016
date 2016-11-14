//
//  ConsoleIO.swift
//  FlipMatrix
//
//  Created by Anh Son Le on 11/14/16.
//  Copyright © 2016 Anh Son Le. All rights reserved.
//

import Foundation

class ConsoleIO {
	class func input(string: String?) -> String {
		if let clearString = string {
			print(clearString, terminator:"")
		}
		return readLine(strippingNewline: true) ?? ""
	}
	
	class func inputInt(string: String?) -> Int? {
		if let clearString = string {
			print(clearString, terminator:"")
		}
		let stringInput = readLine(strippingNewline: true)
		if let strInput = stringInput {
			return Int(strInput)
		} else {
			return nil
		}
	}
}

extension ConsoleIO {
	class func inputMatrix(dimMatrix: Int) -> [[Int]] {
		var dim = dimMatrix
		if dim < 2 {
			dim = 2
		} else if dim > 256 {
			dim = 256
		}
		var result: [[Int]] = []
		for _ in 0..<dim {
			let rowStr = ConsoleIO.input(string: nil)
			let rowStrArr = rowStr.components(separatedBy: " ")
			let rowIntArr = rowStrArr.map({ (str) -> Int in
				return Int(str) ?? 0
			})
			result.append(rowIntArr)
		}
		return result
	}
	
	class func printMatrix(_ matrix: [[Int]], row: Int, col: Int) {
		for i in 0..<row {
			for j in 0..<col {
				print("\(matrix[i][j]) ", terminator:"")
			}
			print("\n")
		}
	}
}
