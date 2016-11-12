/* Owner: Ngo Duc Dung
	Last update: 04/09/2016 */

// THE JASMINE TEST CODE
describe("Testing Calculate(minutes) function: Using All-DU-Path", function() {
	describe("InValid cases", function(){
		it("Function should return undefined value if input is empty", function()
	    { 
	        expect( calculate('', "none") ).toBeUndefined();
	        expect( calculate(null, "none") ).toBeUndefined();
	    });

	    it("Function should return undefined value if input is null", function()
	    {
	        expect( calculate(null, "none") ).toBeUndefined();
	    });

	    it("Function should return undefined value if input is not a number", function()
	    { 
	        expect( calculate() ).toBeUndefined();
	        expect( calculate(null, "none") ).toBeUndefined();
	    });

	    it("Function should return undefined value if input is a string which has 1st letter is number", function()
	    {
	        expect( calculate("0p", "none") ).toBeUndefined();
	    });
	});

	describe("Valid value cases, user not use any sale pack", function(){
		//Bourdary: 0
		it("Costs should be 0 when minute is less than 0", function()
	    { 
	        expect( calculate(-1, "none") ).toBe( 0 ); 
	    });
		it("Costs should be 0 when minute is equal 0", function()
	    { 
	        expect( calculate(0, "none") ).toBe( 0 ); 
	    });
	    it("Costs should be 25000 when minute(s) is 1", function()
	    { 
	        expect( calculate(1, "none") ).toBe( 25600 ); 
	    });

	    //Bourdary: 50
	    it("Costs should be 55000$ after first 50 minutes", function()
	    { 
	        expect( calculate(50, "none") ).toBe( 55000 ); 
	    });

	    //Boundary: 50 - 200
	    it("Costs should be 95000$ after 150 minutes", function()
	    { 
	        expect( calculate(150, "none") ).toBe( 95000 ); 
	    });

	    //Bourdary: 200
	    it("Costs should be 115000$ after 200 minutes", function()
	    { 
	        expect( calculate(200, "none") ).toBe( 115000 ); 
	    });
	});

	//Three test case using All-Du-Path
	describe("Valid value cases, user uses a sale pack", function(){
		it("Costs should be 0 when minutes are 20 minutes and user registered DK3 pack", function()
	    { 
	        expect( calculate(20, "DK3") ).toBe( 0 ); 
	    });
	    it("Costs should be 0 when minutes are 100 minutes and use registered KM100 pack", function()
	    { 
	        expect( calculate(100, "KM100") ).toBe( 0 ); 
	    });
	    it("Costs should be 370000 when minutes are 20 but user doesn't registered and sale pack", function()
	    { 
	        expect( calculate(20, "none") ).toBe( 37000 ); 
	    });
	});

	describe("Special cases", function(){
		//Special case
		it("Costs should be 0 after -100000000000000 minutes", function()
	    { 
	        expect( calculate(-100000000000000, "none") ).toBe( 0 ); 
	    });
	    it("Costs should be 20000000000075000$ after 100000000000000 minutes", function()
	    { 
	        expect( calculate(100000000000000, "none") ).toBe( 20000000000075000 ); 
	    });
	    it("Costs should be 2.0000000000000001e+34$ after 100000000000000000000000000000000 minutes", function()
	    { 
	        expect( calculate(100000000000000, "none") ).toBe( 20000000000075000 ); 
	    });
	    it("Costs should be an appropriate value when input is a char or string of number letter(s)", function()
	    { 
	        expect( calculate('0', "none") ).toBe( 0 ); 
	        expect( calculate('1', "none") ).toBe( 25600 );
	        expect( calculate("200", "none") ).toBe( 115000 );
	        expect( calculate("49.9999", "none") ).toBe( 54999.94 );
	         expect( calculate(' 5', "none") ).toBe( 28000 );
	    });
	});
    
    
});