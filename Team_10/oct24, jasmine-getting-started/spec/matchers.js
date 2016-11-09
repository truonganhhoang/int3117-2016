describe("Một số matcher", function(){
	
	it("So sánh 2 objects", function(){
		var student1 = {
			name: "Anh", 
			old: 22 
		};
		var student2 = {
			name: "Anh",
			old: 22
		};
		expect(student1).toEqual(student2);
	});
	
	it("Sử dụng toBeDefined", function() {
		var a = {
			foo: "foo"
		};

		expect(a.foo).toBeDefined();
		expect(a.bar).not.toBeDefined();
	});

	it("Sử dụng toBeUndefined", function() {
		var a = {
			foo: "foo"
		};

		expect(a.foo).not.toBeUndefined();
		expect(a.bar).toBeUndefined();
	});

	it("Sử dụng toBeNull", function() {
		var a = null;
		var foo = "foo";

		expect(null).toBeNull();
		expect(a).toBeNull();
		expect(foo).not.toBeNull();
	});

});
