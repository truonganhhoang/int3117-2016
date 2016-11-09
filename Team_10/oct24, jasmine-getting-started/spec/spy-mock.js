describe("Dùng spy", function() {
	var person, eaten = null;
	
	//Hàm này được chạy ở đầu mỗi test case
	beforeAll(function(){
		person = {
			eat: function(value) {
				eaten = value;
			}
		};
		
		//Gắn spy vào để theo dõi hàm eat của object person
		spyOn(person, 'eat');
		
		person.eat('banana');
	});
	
	it("tracks that spy was called", function() {
		expect(person.eat).toHaveBeenCalled();
	});
	
	it("tracks all the arguments of its calls", function() {
		expect(person.eat).toHaveBeenCalledWith('banana');
	});
	
	it("stops all excution on a function", function() {
		//Spy sẽ chặn hàm eat, do đó giá trị eaten không được setActive
		expect(eaten).toBeNull();
	});
	
	
	
});