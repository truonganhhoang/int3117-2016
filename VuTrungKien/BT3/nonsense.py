def is_x_more_dangerous_than_y(x, y, crazy_level):
    x_danger = x
    y_danger = y
    exciting_level = abs(x - y)
    while exciting_level > 0:
        if abs(crazy_level) < 9000 \
                or crazy_level > 0 \
                and crazy_level % 2 == 0:
            x_danger += crazy_level
            y_danger += crazy_level
        else:
            x_danger = -(x_danger + crazy_level)
            y_danger = -(y_danger + crazy_level)
        crazy_level = crazy_level / exciting_level
        exciting_level -= 10
    if x_danger > y_danger:
        return True
    else:
        return False
