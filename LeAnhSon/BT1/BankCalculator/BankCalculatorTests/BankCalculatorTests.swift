//
//  BankCalculatorTests.swift
//  BankCalculatorTests
//
//  Created by Anh Son Le on 9/5/16.
//  Copyright © 2016 Anh Son Le. All rights reserved.
//

import XCTest
@testable import BankCalculator

class BankCalculatorTests: XCTestCase {
	
	var vc: ViewController!
    
    override func setUp() {
        super.setUp()
        // Put setup code here. This method is called before the invocation of each test method in the class.
		let storyBoard = UIStoryboard.init(name: "Main", bundle: NSBundle.mainBundle())
		vc = storyBoard.instantiateInitialViewController() as! ViewController
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
        self.measureBlock {
            // Put the code you want to measure the time of here.
        }
    }
	
	// MARK: - Test valid Money, Interest rate, due
	
	func testValidMoney() {
		let testCases = [(-10, 0), (1000000, 1000000), (MAXFLOAT, MAXFLOAT)]
		testCases.forEach {
			XCTAssertEqual(vc.validMoney($0), $1)
		}
	}
	
	func testRate() {
		let testCases = [(-10, 0),(0, 0),(50, 50), (100, 100), (101, 100), (MAXFLOAT, 100)]
		testCases.forEach {
			XCTAssertEqual(vc.validRate($0), Float($1))
		}
	}
	
	func testDue() {
		let testCases = [(-10, 0),(0, 0),(12, 12), (100, 12)]
		testCases.forEach {
			XCTAssertEqual(vc.validDue($0), $1)
		}
	}
	
	func testCalculate() {
//		let testCases = [(, 0),(0, 0),(12, 12), (100, 12)]
	}
}
