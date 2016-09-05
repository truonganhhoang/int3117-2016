/* Owner: Ngo Duc Dung
	Last update: 04/09/2016 */

// THE JASMINE TEST CODE
describe("Testing Calculate(minutes) function:", function() {

	describe("Valid value cases", function(){
		it("Costs should be 0 when minute is less or equal 0", function()
	    { 
	        expect( calculate(0) ).toBe( 0 ); 
	    });

	    it("Costs should be 25000 when minute(s) is more than 0", function()
	    { 
	        expect( calculate(1) ).toBe( 25600 ); 
	    });

	    it("Costs should be 55000$ after first 50 minutes", function()
	    { 
	        expect( calculate(50) ).toBe( 55000 ); 
	    });

	    it("Costs should be 115000$ after 200 minutes", function()
	    { 
	        expect( calculate(200) ).toBe( 115000 ); 
	    });

	    it("Costs should be 115200$ after 201 minutes", function()
	    { 
	        expect( calculate(201) ).toBe( 115200 ); 
	    });

	    it("Costs should be 54999.94$ after first 49.9999 minutes", function()
	    { 
	        expect( calculate(49.9999) ).toBe( 54999.94 ); 
	    });

	    it("Costs should be 20000000000075000$ after 100000000000000 minutes", function()
	    { 
	        expect( calculate(100000000000000) ).toBe( 20000000000075000 ); 
	    });

	    it("Costs should be an appropriate value when input is a char or string of number letter(s)", function()
	    { 
	        expect( calculate('0') ).toBe( 0 ); 
	        expect( calculate('1') ).toBe( 25600 );
	        expect( calculate("200") ).toBe( 115000 );
	        expect( calculate("49.9999") ).toBe( 54999.94 ); 
	    });
	});
    
    describe("InValid cases", function(){
		it("Function should return undefined value if input is empty or null", function()
	    { 
	        expect( calculate() ).toBeUndefined();
	        expect( calculate('') ).toBeUndefined();
	        expect( calculate(null) ).toBeUndefined();
	    });

	    it("Function should return undefined value if input is not a number", function()
	    { 
	        expect( calculate() ).toBeUndefined();
	        expect( calculate(null) ).toBeUndefined();
	    });

	    it("Function should return undefined value if input is a string which has 1st letter is number", function()
	    {
	        expect( calculate("0p") ).toBeUndefined();
	    });
	});
});