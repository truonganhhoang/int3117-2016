/*!
 * QUnit 2.0.1
 * 
 *
 * Created by Pham Thi Dao
 *
 * Date: 2016-09-6
 */
QUnit.test("pretty_date_basics", function( assert ) {
    var now = "2016/09/19 22:25:00";

    assert.equal(prettyDate(now, "2016/09/19 22:24:30"), "just now");
    assert.equal(prettyDate(now, "2016/09/19 22:24:59"), "just now");
    assert.equal(prettyDate(now, "2016/09/19 22:25:00"), "just now");

    assert.equal(prettyDate(now, "2016/09/19 22:23:01"), "1 minute ago");
    assert.equal(prettyDate(now, "2016/09/19 22:24:00"), "1 minute ago");

    assert.equal(prettyDate(now, "2016/09/19 21:25:00"), "1 hour ago");
    assert.equal(prettyDate(now, "2016/09/19 21:24:59"), "1 hour ago");

    assert.equal(prettyDate(now, "2016/09/18 22:24:59"), "Yesterday");
    assert.equal(prettyDate(now, "2016/09/18 22:25:00"), "Yesterday");

    assert.equal(prettyDate(now, "2016/09/17 22:23:30"), "2 days ago");

    assert.equal(prettyDate(now, "2016/09/16 22:23:30"), "2 days ago");
    assert.equal(prettyDate(now, "2016/09/18 22:23:30"), "2 days ago");

    assert.equal(prettyDate(now, "2015/09/17 22:23:30"), undefined);
});