_ = None
n = _
house_list = []
flag = _
x_index = _
y_index = _
count = 0

class list_info:
    def __init__(self, x_index, y_index):
        self.x_index = x_index
        self.y_index = y_index
        if x_index == 0:
            if y_index == 0:
                self.start_rotate_index = x_index + 1
                self.finish_rotate_index = x_index - 1
            elif y_index == n - 1:
                self.start_rotate_index = y_index - 1
                self.finish_rotate_index = y_index + 1
            else:
                self.start_rotate_index = y_index - 1
                self.finish_rotate_index = x_index - 1
        elif x_index == n - 1:
            if y_index == 0:
                self.start_rotate_index = y_index + 1
                self.finish_rotate_index = y_index - 1
            elif y_index == n - 1:
                self.start_rotate_index = x_index - 1
                self.finish_rotate_index = x_index + 1
            else:
                self.start_rotate_index = y_index + 1
                self.finish_rotate_index = x_index + 1
        else:
            if y_index == 0: 
                self.start_rotate_index = x_index + 1
                self.finish_rotate_index = y_index - 1
            elif y_index == n - 1:
                self.start_rotate_index = x_index - 1
                self.finish_rotate_index = y_index + 1
            else:
                self.start_rotate_index = y_index - 1
                self.finish_rotate_index = _

    def valid_count_up_y_check(self):
        try:
            if self.y_index - 1 == 0:
                return True
            else:
                return False
        except IndexError:
            return True
            
    def valid_count_up_x_check(self):
        try:
            if self.x_index - 1 == 0:
                self.valid_count_up_y_check(self)
            else:
                return False
        except IndexError:
            self.valid_count_up_y_check(self)
            
    def valid_count_up_index_check(self):
        return valid_count_up_x_check(self)
    
    def rotation_til_finish_index(self):
        
        
def recursive_direction_check(list_info_parm):
    if list_info_parm.x_index + 1 == n and list_info_parm.y_index + 1 == n:
        if list_info_parm.valid_count_up_index_check():
            count += 1
        else:
            return _
    if list_info_parm.valid_count_up_index_check():
        pass #run direction check
    else:
        new_list_info = list_info(list_info_parm.x_index + , y_index)
        del list_info_parm
        recursive_direction_check()

def list_input():
    n = int(input())
    for i in range(n):
        house_list[i] = list(map(int, input().split()))

def main():
    list_input()
    
    first_list_info = list_info(0, 0)    
    recursive_direction_check(first_list_info)

if __name__ == '__main__':
    main()