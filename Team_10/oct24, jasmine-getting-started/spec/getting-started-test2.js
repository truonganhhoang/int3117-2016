describe("Sử dụng before và after", function(){
	beforeEach(function(){
		//Hàm này được dùng mỗi lần vào mỗi đầu test
		
	});
	
	afterEach(function(){
		//Hàm này được dùng nhiều lần vào cuối mỗi test
	});
	
	beforeAll(function(){
		//Hàm này được sử dụng một lần duy nhất trước khi chạy các test case describe
	});
	
	afterAll(function(){
		//Hàm này được sử dụng một lần duy nhất sau khi chạy các test case trong describe
	});
	
});