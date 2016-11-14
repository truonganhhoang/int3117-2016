//
//  ViewController.swift
//  BankCalculator
//
//  Created by Anh Son Le on 9/5/16.
//  Copyright © 2016 Anh Son Le. All rights reserved.
//

import UIKit

let kIdResultCell = "ResultCell"

class ViewController: UIViewController, UITableViewDelegate, UITableViewDataSource {

	// MARK: - Declare
	
	@IBOutlet weak var txtMoney: UITextField!
	@IBOutlet weak var txtInteresRate: UITextField!
	@IBOutlet weak var txtDue: UITextField!
	
	@IBOutlet weak var tableView: UITableView!
	
	var results: [Float] = []
	
	// MARK: - LifeCycle
	
	override func viewDidLoad() {
		super.viewDidLoad()
		// Do any additional setup after loading the view, typically from a nib.
		setDefault()
	}

	override func didReceiveMemoryWarning() {
		super.didReceiveMemoryWarning()
		// Dispose of any resources that can be recreated.
	}
	
	// MARK: - TableView
	
	func tableView(tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
		return results.count
	}
	
	func tableView(tableView: UITableView, cellForRowAtIndexPath indexPath: NSIndexPath) -> UITableViewCell {
		let cell = tableView.dequeueReusableCellWithIdentifier(kIdResultCell, forIndexPath: indexPath)
		cell.textLabel?.text = "\((indexPath.row + 1) * Int(txtDue.text!)!)"
		cell.detailTextLabel?.text = "\(results[indexPath.row])"
		return cell
	}

	// MARK: - Private func
	
	func setDefault() {
		txtMoney.text = "0"
		txtDue.text = "0"
		txtInteresRate.text = "0"
		tableView.reloadData()
	}
	
	func validRate(rate: Float?) -> Float {
		if let clearRate = rate {
			if clearRate > 100 {
				return 100
			} else if clearRate < 0 {
				return 0
			} else {
				return clearRate
			}
		} else {
			return 0
		}
	}
	
	func validDue(month: Int?) -> Int {
		if let clearMonth = month {
			if clearMonth > 12 {
				return 12
			} else if clearMonth < 0 {
				return 0
			} else {
				return clearMonth
			}
		} else {
			return 0
		}
	}
	
	func validMoney(money: Float?) -> Float {
		if let clearMoney = money {
			if clearMoney < 0 {
				return 0
			} else {
				return clearMoney
			}
		} else {
			return 0
		}
	}
	
	func calculateMoney(originMoney: Float?, interestRate: Float?) -> Float {
		if let money = originMoney {
			if let rate = interestRate {
				return (money + (money * rate / 100))
			} else {
				return 0
			}
		} else {
			return 0
		}
	}
	
	func updateResults(money: Float!, rate: Float) {
		self.results.removeAll()
		let firstValue = self.calculateMoney(money, interestRate: rate)
		self.results.append(firstValue)
		for index in 1...9 {
			let data = self.calculateMoney(results[index - 1], interestRate: rate)
			self.results.append(data)
		}
	}
	
	// MARK: - Action
	
	@IBAction func txtMoneyValueChanged(sender: AnyObject) {
		var value: Float?
		if let text = txtMoney.text {
			value = Float(text)
		} else {
			value = 0
		}
		txtMoney.text = "\(self.validMoney(value))"
		updateResults(self.validMoney(value), rate: self.validRate(Float(txtInteresRate.text!)))
		tableView.reloadData()
	}
	
	@IBAction func txtRateValueChanged(sender: AnyObject) {
		var value: Float?
		if let text = txtInteresRate.text {
			value = Float(text)
		} else {
			value = 0
		}
		txtInteresRate.text = "\(self.validRate(value))"
		updateResults(self.validMoney(Float(txtMoney.text!)), rate: self.validRate(value))
		tableView.reloadData()
	}
	
	@IBAction func txtDueValueChanged(sender: AnyObject) {
		var value: Int?
		if let text = txtDue.text {
			value = Int(text)
		} else {
			value = 0
		}
		txtDue.text = "\(self.validDue(value))"
		tableView.reloadData()
	}
	
	override func touchesBegan(touches: Set<UITouch>, withEvent event: UIEvent?) {
		self.view.endEditing(true)
	}
}

