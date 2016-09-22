/*!
 * QUnit 2.0.1
 * 
 *
 * Created by Pham Thi Dao
 *
 * Date: 2016-09-6
 */

QUnit.test("prettydate basics", function( assert ) {
    var now = "2016/08/28 22:25:00";
    assert.equal(prettyDate(now, "2016/08/28 22:24:30"), "just now");
    assert.equal(prettyDate(now, "2016/08/28 22:23:30"), "1 minute ago");
    assert.equal(prettyDate(now, "2016/08/28 21:23:30"), "1 hour ago");
    assert.equal(prettyDate(now, "2016/09/27 22:23:30"), "Yesterday");
    assert.equal(prettyDate(now, "2016/08/26 22:23:30"), "2 days ago");
    assert.equal(prettyDate(now, "2016/08/29 22:24:30"), "just now");
    assert.equal(prettyDate(now, "2015/08/28 22:23:30"), "1 minute ago");
    assert.equal(prettyDate(now, "2016/08/28 23:23:30"), "1 hour ago");
    assert.equal(prettyDate(now, "2016/09/27 22:23:30"), "Yesterday");
    assert.equal(prettyDate(now, "2016/08/26 22:23:30"), "2 days ago");
    assert.equal(prettyDate(now, "2015/08/26 22:23:30"), undefined);
  });