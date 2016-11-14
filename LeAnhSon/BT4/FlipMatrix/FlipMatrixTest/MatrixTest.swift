//
//  MatrixTest.swift
//  FlipMatrix
//
//  Created by Anh Son Le on 11/14/16.
//  Copyright © 2016 Anh Son Le. All rights reserved.
//

import XCTest
//import FlipMatrix


class MatrixTest: XCTestCase {

	var matrix: Matrix!
	
	let testCase1 = [[1, 1], [1, 1]]
	let testCase2 = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]
	var testCases: [[[Int]]] = []
	var testResult: [Int] = []
	
    override func setUp() {
        super.setUp()
        matrix = Matrix()
		testCases = [testCase1, testCase2]
		testResult = [1, 54]
    }
    
    override func tearDown() {
        // Put teardown code here. This method is called after the invocation of each test method in the class.
        super.tearDown()
    }

    func testExample() {
        // This is an example of a functional test case.
        // Use XCTAssert and related functions to verify your tests produce the correct results.
    }

    func testPerformanceExample() {
        // This is an example of a performance test case.
        self.measure {
            // Put the code you want to measure the time of here.
        }
    }
	
	// MARK: - Func test
	func testInit() {
		matrix = Matrix.init()
		XCTAssert(matrix.cols == 0)
		XCTAssert(matrix.rows == 0)
		XCTAssert(matrix.matrix.count == 0)
	}
	
	func testInitMatrix() {
		for testCase in testCases {
			XCTAssert(Matrix(array: testCase).matrix.elementsEqual(testCase, by: { (row1, row2) -> Bool in
				row1.elementsEqual(row2)
			}))
		}
	}

	func testMaxFlipMatrix() {
		for i in 0..<testCases.count {
			matrix = Matrix(array: testCases[i])
			XCTAssert(matrix.maxFlipMatrix() == testResult[i])
		}
	}
}
