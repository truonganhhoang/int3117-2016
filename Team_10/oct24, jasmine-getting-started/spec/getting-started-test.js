describe("Cộng trừ", function(){
	
	var cal = new Calculator();

	
	it("1 + 1 = 2", function(){
		expect(2).toBe(cal.add(1, 1));
	});
	
	it("2 + 2 = 4", function(){
		expect(4).toBe(cal.add(2, 2));	
	});
	
	it("5 - 2 = 3", function(){
		expect(3).toBe(cal.minus(5, 2));
	});
	
	it("1 + 1 != 3", function(){
		expect(3).not.toBe(cal.add(1, 1));
	});

});

describe("Nhân chia", function() {
  var cal = new Calculator();

  it("5 * 2 = 10", function() {
    expect(10).toBe(cal.multiply(5,2));
  });

  it("6 / 2 = 3", function() {
    expect(3).toBe(cal.divide(6,2));
  });
});