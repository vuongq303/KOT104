import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.hq.quanhqph33420_assignment.db.ProductRepository
import com.hq.quanhqph33420_assignment.db.ProductViewModel

class ProductViewModelFactory(private val productRepository: ProductRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ProductViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return ProductViewModel(productRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
