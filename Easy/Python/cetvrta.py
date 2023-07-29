def find_fourth_point(points):
    x_coords = [point[0] for point in points]
    y_coords = [point[1] for point in points]
    fourth_point = (0, 0)
    for x in x_coords:
        if x_coords.count(x) == 1:
            fourth_point = (x, fourth_point[1])
            break
    for y in y_coords:
        if y_coords.count(y) == 1:
            fourth_point = (fourth_point[0], y)
            break
    return fourth_point

if __name__ == "__main__":
    points = []
    for i in range(3):
        point = tuple(map(int, input().split()))
        points.append(point)
    fourth_point = find_fourth_point(points)
    print(fourth_point[0], fourth_point[1])
