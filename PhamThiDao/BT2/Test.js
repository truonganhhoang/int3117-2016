/*!
 * QUnit 2.0.1
 * 
 *
 * Created by Pham Thi Dao
 *
 * Date: 2016-09-6
 */
QUnit.test("so_nguyen_to", function( assert ) {
     // var now = "2016/09/19 22:25:00";

    assert.equal(kiem_tra_snt(0), "Khong la so nguyen to!");
    assert.equal(kiem_tra_snt(1), "Khong la so nguyen to!");
    assert.equal(kiem_tra_snt(2), "La so nguyen to!");

    assert.equal(kiem_tra_snt(3), "La so nguyen to!");
    assert.equal(kiem_tra_snt(1231), "La so nguyen to!");
  });