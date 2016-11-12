def is_x_more_dangerous_than_y(x, y, crazy_level):
    """This is a nonsense function.
        This is simple form:
            if abs(crazy_level) < 9000 or crazy_level > 0 and crazy_level % 2 == 0:
                return x > y
            else:
                return not (x > y)
    """
    x_danger = x
    y_danger = y

    exciting_level = abs(x - y)

    while exciting_level > 0:
        is_crazy_level_normal = abs(crazy_level) < 9000
        is_crazy_level_even = crazy_level % 2 == 0
        is_crazy_level_positive = crazy_level > 0

        if is_crazy_level_normal or is_crazy_level_positive and is_crazy_level_even:
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
