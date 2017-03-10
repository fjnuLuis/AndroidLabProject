# Project SimpleAdaptTest.
The project is testing about using Listview ,SimpleAdapter and Toast.

---
## Implement the Listview.

* Set the listview style in the main_activity.xml.
 
```xml
<?xml version="1.0" encoding="UTF-8"?>
<ListView
        android:id="@+id/myList"
        android:layout_height="wrap_content"
        android:layout_width="match_parent"
        />
```
* Set the Listitem style in a new layout xml.
```xml
<?xml version="1.0" encoding="UTF-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">


    <TextView
        android:id="@+id/name"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="30sp"
        android:textColor="#f0f"
        android:paddingLeft="10dp"
         />

    <ImageView
        android:id="@+id/header"
        android:layout_width="60dp"
        android:layout_height="40dp"
        android:paddingLeft="10dp"
        android:scaleType="fitXY"
        android:layout_alignParentTop="true"
        android:layout_alignParentRight="true"
        android:layout_alignParentEnd="true" />


</RelativeLayout>
```

* Import the data into Listview.

```Android
 SimpleAdapter simpleAdapter = new SimpleAdapter(this, listItems,
                R.layout.simple_item,
                new String[]{"header", "name"},
                new int[]{R.id.header,R.id.name});
        ListView list=(ListView) findViewById(R.id.myList);
        list.setAdapter(simpleAdapter);
```
---

## Import the exist picture into project.

* Copy resource into the folder: WORKSPACE/PROJECT_NAME/app/src/main/res/drawable,and use them by name,
     because the drawable will load the picture automatically. 

![path to workspace](path.png)
```Android
private int[] imageIds = new int[]
            {R.drawable.lion,R.drawable.tiger,R.drawable.monkey,
            R.drawable.dog,R.drawable.cat,R.drawable.elephant};
```

---

## Implement the toast.

* Using this function in anywhere anytime you want to show a toast.If you want to know 
    how to use this function, you need to look for the android API.

```Android
Toast.makeText(MainActivity.this,
                        names[position],Toast.LENGTH_SHORT).show();
```

---
## Preview
![The result of project](result.png)

## author
* Name:Luis
* Email:[@Luis](1396954967@qq.com)
* QQ:1396954967
* CSDN:[fjnuLuis](http://blog.csdn.net/lin_13969)
