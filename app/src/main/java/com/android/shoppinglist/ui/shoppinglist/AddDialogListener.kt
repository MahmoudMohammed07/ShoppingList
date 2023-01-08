package com.android.shoppinglist.ui.shoppinglist

import com.android.shoppinglist.data.db.entity.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}